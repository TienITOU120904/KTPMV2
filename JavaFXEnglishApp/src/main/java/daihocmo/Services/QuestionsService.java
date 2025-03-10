/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daihocmo.Services;

import daihocmo.pojo.Choice;
import daihocmo.pojo.Question;
import daihocmo.pojo.JdbcUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuestionsService {
   

     public List<Choice> getChoices(int limit) throws SQLException {
            List<Choice> results1 = new ArrayList<>();
            try (Connection conn = JdbcUtils.getConn()) {
        
                String sq1 = "SELECT * FROM Choice ORDER BY rand() question_id=?";
                PreparedStatement stm = conn.prepareCall(sq1);

                stm.setInt(1, limit);
                ResultSet rs = stm.executeQuery();
                while(rs.next())
                {
                    Choice c = new Choice(rs.getString("id"), rs.getString("content"), rs.getBoolean("is_correct"), rs.getString("question_id"));
                    results1.add(c);
                }
                    return results1;
                }
    }

      public List<Question> getQuestions(int limit) throws SQLException {
            List<Question> results = new ArrayList<>();
            try (Connection conn = JdbcUtils.getConn()) {
        
                String sq1 = "SELECT * FROM Question ORDER BY rand() LIMIT ?";
                PreparedStatement stm = conn.prepareCall(sq1);

                stm.setInt(1, limit);
                ResultSet rs = stm.executeQuery();
                while(rs.next())
                {
                    Question q = new Question(rs.getString("id"), rs.getString("content"), rs.getInt("category_id"));
                    results.add(q);
                }
                    return results;
                }
    }
    
    
    
}
