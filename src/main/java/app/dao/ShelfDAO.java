package app.dao;

import app.config.SpringConfig;
import app.models.Shelf;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ShelfDAO {

    private final JdbcTemplate jdbcTemplate = SpringConfig.jdbcTemplate();

    public List<Shelf> index() {
        return jdbcTemplate.query("SELECT * FROM public.\"Shelf\"", new BeanPropertyRowMapper<>(Shelf.class));
    }

    public Shelf show(long userId) {
        return jdbcTemplate.query("SELECT * FROM public.\"Shelf\" WHERE userId=?", new Object[]{userId}, new BeanPropertyRowMapper<>(Shelf.class))
                .stream().findAny().orElse(null);
    }

    public void save(Shelf shelf) {
        jdbcTemplate.update("INSERT INTO public.\"Shelf\"(userid, username, totalvalue) VALUES(?, ?, ?)",
                shelf.getUserId(), shelf.getUserName(), shelf.getTotalValue());
    }

    public void update(long userId, Shelf shelf) {
        jdbcTemplate.update("UPDATE public.\"Shelf\" SET username=?, totalvalue=? WHERE userid=?",
                shelf.getUserName(), shelf.getTotalValue(), userId);
    }

    public void delete (long userId) {
        jdbcTemplate.update("DELETE FROM public.\"Shelf\" WHERE userid=?", userId);
    }
}
