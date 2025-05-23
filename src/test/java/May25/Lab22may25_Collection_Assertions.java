package May25;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Lab22may25_Collection_Assertions {
    @Test
    public void testListAssertion(){
        List<String> fruits = List.of("Apple", "Banana", "Mango", "Guava","Pineapple");
        assertThat(fruits).hasSize(5)
                .contains("Mango")
                .doesNotContain("Grapes")
                .startsWith("Apple");
        System.out.println("Validation done");
    }
}
