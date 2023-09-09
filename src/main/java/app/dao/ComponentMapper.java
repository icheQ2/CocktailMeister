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
        component.setUserId(resultSet.getLong("userId"));
        component.setId(resultSet.getLong("id"));
        component.setProduct(resultSet.getString("product"));
        int type = resultSet.getInt("mainType");
        component.setMainType(Type.values()[type]);
        try {
            component.setSubType(Type.getSubType(Type.values()[type], resultSet.getInt("subType")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        component.setCostPerUnit(resultSet.getDouble("costPerUnit"));
        component.setCurrentVolume(resultSet.getDouble("currentVolume"));
        component.setTotalCost(resultSet.getDouble("totalCost"));
        component.setComment(resultSet.getString("comment"));
        return component;
    }
}
