package Mockito.Mock;


import org.example.Student.StudentDAO;
import org.example.Student.StudentService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceMocktest {

    @Test
    public void testFindTotal()
    {
        StudentDAO daoMock= mock(StudentDAO.class);//mocking immitating
        System.out.println(daoMock.getClass().getSimpleName());
        when(daoMock.getScore()).thenReturn(new int[]{10,40,30});
        StudentService service=new StudentService(daoMock);

        int total=service.findTotalScore();
        assertEquals(80,total);
    }

}
