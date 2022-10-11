package studentTesting;

import org.example.Student.StudentDAO;
import org.example.Student.StudentService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GetScoresTesting {

    @Test
    public void testFindTotal()
    {
        StudentService service=new StudentService(new StudentDaoStub());
        int total=service.findTotalScore();

        assertEquals(110,total);

    }

}
//using stub as imitation dao instead of studentdao
//and using it for testings
//Stub is like a dummy where we use the interface approach//data inside the stub is dummy data
class StudentDaoStub extends StudentDAO {
    @Override
    public int[] getScore(){
        return new int[]{40,50,20};
    }

}
