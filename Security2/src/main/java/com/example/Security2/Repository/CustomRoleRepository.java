package com.example.Security2.Repository;

import com.example.Security2.Model.Role;
import com.example.Security2.Model.User;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import java.util.List;

public class CustomRoleRepository {

    private EntityManager entityManager;

    public List<Role> getRole(User user) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT r.name as name\n" +
                " FROM user u\n" +
                " JOIN user_role ur ON u.user_id=ur.user_id\n" +
                " JOIN role r ON r.id=ur.role_id");
        sql.append("Where 1=1");
        if (user.getEmail() != null) {
            sql.append("and email=:email");
        }
        NativeQuery<Role> query = ((Session) entityManager.getDelegate()).createNativeQuery(sql.toString());
        if (user.getEmail() != null) {
            query.setParameter("email", user.getEmail());
        }
        query.addScalar("name", StandardBasicTypes.STRING);
        query.setResultListTransformer(Transformers.aliasToBean(Role.class));


        return query.list();
    }
}
