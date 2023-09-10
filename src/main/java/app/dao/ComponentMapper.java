package app.dao;

import app.enums.component_types.Type;
import app.models.Component;
import org.springframework.jdbc.core.RowMapper;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ComponentMapper implements RowMapper<Component> {
    @Override
    public Component mapRow(ResultSet resultSet, int i) throws SQLException {
        Component component = new Component();
        component.setId(resultSet.getLong("id"));
        component.setUserId(resultSet.getLong("userid"));
        component.setProduct(resultSet.getString("product"));
        int type = resultSet.getInt("maintype");
        component.setMainType(Type.values()[type]);
        try {
            component.setSubType(Type.getSubType(Type.values()[type], resultSet.getInt("subtype")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        component.setCostPerUnit(resultSet.getDouble("costperunit"));
        component.setCurrentVolume(resultSet.getDouble("currentvolume"));
        component.setTotalCost(resultSet.getDouble("totalcost"));
        component.setComment(resultSet.getString("comment"));
        return component;
    }
}
