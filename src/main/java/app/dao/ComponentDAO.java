package app.dao;

import app.config.SpringConfig;
import app.models.Component;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ComponentDAO {

    private final JdbcTemplate jdbcTemplate = SpringConfig.jdbcTemplate();

    public List<Component> index() {
        return jdbcTemplate.query("SELECT * FROM public.\"Component\"", new ComponentMapper());
    }

    public List<Component> showAll(long userId) {
        return jdbcTemplate.query("SELECT * FROM public.\"Component\" WHERE userid=?", new Object[]{userId}, new ComponentMapper());
    }

    public Component show(long id) {
        return jdbcTemplate.query("SELECT * FROM public.\"Component\" WHERE id=?", new Object[]{id}, new ComponentMapper())
                .stream().findAny().orElse(null);
    }

    public void save(Component component) {
        jdbcTemplate.update(
                "INSERT INTO public.\"Component\"(userid, product, maintype, subtype, costperunit, currentvolume, totalcost, comment) VALUES(?, ?, ?, ?, ?, ?, ?, ?)",
                component.getUserId(), component.getProduct(), component.getMainType().getOrdinal(), component.getSubType().getOrdinal(),
                component.getCostPerUnit(), component.getCurrentVolume(), component.getTotalCost(), component.getComment());
    }

    public void update(long id, Component component) {
        jdbcTemplate.update("UPDATE public.\"Component\" SET product=?, maintype=?, subtype=?, costperunit=?, currentvolume=?, totalcost=?, comment=? WHERE id=?",
                component.getProduct(), component.getMainType().getOrdinal(), component.getSubType().getOrdinal(),
                component.getCostPerUnit(), component.getCurrentVolume(), component.getTotalCost(),
                component.getComment(), id);
    }

    public void delete (long id) {
        jdbcTemplate.update("DELETE FROM Component WHERE id=?", id);
    }
}
