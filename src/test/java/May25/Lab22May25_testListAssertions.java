package May25;
import org.testng.annotations.Test;
import java.lang.*;
import static org.assertj.core.api.Assertions.assertThat;

public class Lab22May25_testListAssertions {

    @Test
    public void testBasicAssertion(){
        String name =new String();
        name ="Ravi";
        assertThat(name).isEqualTo("Ravi").startsWith("Ra").hasSize(4);
    }
}
