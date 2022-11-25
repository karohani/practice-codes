import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RegexTest {

    @Test
    public void 하나만_있으면_매치된다() {
        String pattern = "a";
        boolean matches = pattern.matches( "a" );
        assertThat( matches ).isTrue();
    }

    @Test
    public void 연속해서_있으면_매치되지_않는다() {
        String pattern = "a";
        boolean matches = pattern.matches( "aaa" );
        assertThat( matches ).isFalse();
    }

    public void META_CHARACTERS() {

    }

    @Test
    public void replaceAll_TEST() {
        String result;
        result = "The cat sat on the mat.".replaceAll( "[Tt]he", "*" );
        System.out.println( result );
        assertThat( result ).isEqualTo( "* cat sat on * mat." );

        result = "The cat sat on the mat.".replaceAll( "^[Tt]he", "*" );
        assertThat( result ).isEqualTo( "* cat sat on the mat." );
    }

    @Test
    public void 개행_테스트() {
        String a = "1234 \n";
        boolean matches = a.matches( "1234 \\n" );
        assertThat( matches ).isTrue();
    }

    @Test
    public void 개행_뒤에_여러_문자테스트() {
        String pattern = "ABCD\n";
        String target = "ABCD\nABCD\\n";
        Pattern compile = Pattern.compile( pattern );
        String[] split = compile.split( target );
        System.out.println( split.length );
    }

    @Nested
    class GroupTest {

        @Test
        public void test01() {
            String line = "This order was placed for QT3000! OK?";
            String pattern = "(.*)(\\d+)(.*)";
            // Create a Pattern object
            Pattern r = Pattern.compile( pattern );

            // Now create matcher object.
            Matcher m = r.matcher( line );

            if (m.find()) {
                System.out.println( "Found value: " + m.group( 0 ) );
                System.out.println( "Found value: " + m.group( 1 ) );
                System.out.println( "Found value: " + m.group( 2 ) );
            } else {
                System.out.println( "NO MATCH" );
            }
        }

        @Test
        public void test02() {
            String line = "대한민국 월드컵은 2002년에 있었다.";
            Pattern numReg = Pattern.compile( "\\d" );
            Matcher matcher = numReg.matcher( line );

            assertThat( matcher.find() ).isTrue();
            assertThat( matcher.group() ).isEqualTo( "2" );
            assertThat( matcher.find() ).isTrue();
            assertThat( matcher.group() ).isEqualTo( "0" );
            assertThat( matcher.find() ).isTrue();
            assertThat( matcher.group() ).isEqualTo( "0" );
            assertThat( matcher.find() ).isTrue();
            assertThat( matcher.group() ).isEqualTo( "2" );
        }
    }
}
