import org.junit.Test;
import org.mockito.stubbing.OngoingStubbing;
import sun.jvm.hotspot.utilities.Assert;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SplitterTest {
    @Test
    public void shouldSplitInput(){
        Splitter splitter = mock(Splitter.class);
        String[] words = {"1","book","at","12.49"};
        OngoingStubbing<String[]> ongoingStubbing = when(splitter.splitLineIntoWords()).thenReturn(words);

        String actualwords[] = splitter.splitLineIntoWords();
        String expectedWords[] = {"1","book","at","12.49"};

        assertThat(actualwords, is(expectedWords));
    }
}
