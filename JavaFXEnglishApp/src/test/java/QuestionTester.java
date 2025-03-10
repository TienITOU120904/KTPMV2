/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import daihocmo.Services.QuestionsService;
import daihocmo.pojo.Question;
import java.sql.SQLException;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
/**
 *
 * @author admin
 */
public class QuestionTester {
    @Test
    public void test1() throws SQLException
    {
        QuestionsService s = new QuestionsService();
        List<daihocmo.pojo.Question> q = s.getQuestions(2);
        Assertions.assertEquals(q.size(), 2);
        q.forEach(s);
        
        
        
    }
}
