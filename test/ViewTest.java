import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ViewTest {
    @Test
    public void shouldTakeInputFromUser(){
        View view = mock(View.class);
        when(view.getInput())
                .thenReturn("1 book at 12.49");

        String actualInput = "1 book at 12.49";
        String expectedInput = view.getInput();

        assertThat(actualInput,is(expectedInput));
    }
}
