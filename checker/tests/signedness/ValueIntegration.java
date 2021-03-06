import java.lang.Long;
import org.checkerframework.checker.signedness.qual.*;
import org.checkerframework.common.value.qual.*;

public class ValueIntegration {
    public void ByteValRules(
            @IntVal({0, 127}) byte c,
            @IntVal({128, 255}) byte upure,
            @IntVal({0, 128}) byte umixed,
            @IntVal({-128, -1}) byte spure,
            @IntVal({-1, 127}) byte smixed,
            @IntVal({-128, 0, 128}) byte bmixed) {
        @Signed byte stest;
        @Constant byte ctest;

        ctest = c;

        stest = upure;
        //:: error: (assignment.type.incompatible)
        ctest = upure;

        stest = umixed;
        //:: error: (assignment.type.incompatible)
        ctest = umixed;

        stest = spure;
        //:: error: (assignment.type.incompatible)
        ctest = spure;

        stest = smixed;
        //:: error: (assignment.type.incompatible)
        ctest = smixed;

        stest = bmixed;
        //:: error: (assignment.type.incompatible)
        ctest = bmixed;
    }

    public void CharValRules(
            @IntVal({0, 127}) char c,
            @IntVal({128, 255}) char upure,
            @IntVal({0, 128}) char umixed,
            @IntVal({-128, -1}) char spure,
            @IntVal({-1, 127}) char smixed,
            @IntVal({-128, 0, 128}) char bmixed) {
        @Signed char stest;
        @Constant char ctest;

        ctest = c;

        stest = upure;
        //:: error: (assignment.type.incompatible)
        ctest = upure;

        stest = umixed;
        //:: error: (assignment.type.incompatible)
        ctest = umixed;

        stest = spure;
        //:: error: (assignment.type.incompatible)
        ctest = spure;

        stest = smixed;
        //:: error: (assignment.type.incompatible)
        ctest = smixed;

        stest = bmixed;
        //:: error: (assignment.type.incompatible)
        ctest = bmixed;
    }

    public void ShortValRules(
            @IntVal({0, 32767}) short c,
            @IntVal({32768, 65535}) short upure,
            @IntVal({0, 32768}) short umixed,
            @IntVal({-32768, -1}) short spure,
            @IntVal({-1, 32767}) short smixed,
            @IntVal({-32768, 0, 32768}) short bmixed) {
        @Signed short stest;
        @Constant short ctest;

        ctest = c;

        stest = upure;
        //:: error: (assignment.type.incompatible)
        ctest = upure;

        stest = umixed;
        //:: error: (assignment.type.incompatible)
        ctest = umixed;

        stest = spure;
        //:: error: (assignment.type.incompatible)
        ctest = spure;

        stest = smixed;
        //:: error: (assignment.type.incompatible)
        ctest = smixed;

        stest = bmixed;
        //:: error: (assignment.type.incompatible)
        ctest = bmixed;
    }

    public void IntValRules(
            @IntVal({0, 2147483647}) int c,
            @IntVal({2147483648L, 4294967295L}) int upure,
            @IntVal({0, 2147483648L}) int umixed,
            @IntVal({-2147483648, -1}) int spure,
            @IntVal({-1, 2147483647}) int smixed,
            @IntVal({-2147483648, 0, 2147483648L}) int bmixed) {
        @Signed int stest;
        @Constant int ctest;

        ctest = c;

        stest = upure;
        //:: error: (assignment.type.incompatible)
        ctest = upure;

        stest = umixed;
        //:: error: (assignment.type.incompatible)
        ctest = umixed;

        stest = spure;
        //:: error: (assignment.type.incompatible)
        ctest = spure;

        stest = smixed;
        //:: error: (assignment.type.incompatible)
        ctest = smixed;

        stest = bmixed;
        //:: error: (assignment.type.incompatible)
        ctest = bmixed;
    }

    public void LongValRules(
            @IntVal({0, Long.MAX_VALUE}) long c,
            @IntVal({Long.MIN_VALUE, -1}) long spure,
            @IntVal({-1, Long.MAX_VALUE}) long smixed,
            @IntVal({Long.MIN_VALUE, 0, Long.MAX_VALUE}) long bmixed) {
        @Signed long stest;
        @Constant long ctest;

        ctest = c;

        stest = spure;
        //:: error: (assignment.type.incompatible)
        ctest = spure;

        stest = smixed;
        //:: error: (assignment.type.incompatible)
        ctest = smixed;

        stest = bmixed;
        //:: error: (assignment.type.incompatible)
        ctest = bmixed;
    }

    public void ByteRangeRules(
            @IntRange(from = 0, to = 127) byte c,
            @IntRange(from = 128, to = 255) byte upure,
            @IntRange(from = 0, to = 128) byte umixed,
            @IntRange(from = -128, to = -1) byte spure,
            @IntRange(from = -1, to = 127) byte smixed,
            @IntRange(from = -128, to = 128) byte bmixed) {
        @Signed byte stest;
        @Constant byte ctest;

        ctest = c;

        stest = upure;
        //:: error: (assignment.type.incompatible)
        ctest = upure;

        stest = umixed;
        //:: error: (assignment.type.incompatible)
        ctest = umixed;

        stest = spure;
        //:: error: (assignment.type.incompatible)
        ctest = spure;

        stest = smixed;
        //:: error: (assignment.type.incompatible)
        ctest = smixed;

        stest = bmixed;
        //:: error: (assignment.type.incompatible)
        ctest = bmixed;
    }

    public void CharRangeRules(
            @IntRange(from = 0, to = 127) char c,
            @IntRange(from = 128, to = 255) char upure,
            @IntRange(from = 0, to = 128) char umixed,
            @IntRange(from = -128, to = -1) char spure,
            @IntRange(from = -1, to = 127) char smixed,
            @IntRange(from = -128, to = 128) char bmixed) {
        @Signed char stest;
        @Constant char ctest;

        ctest = c;

        stest = upure;
        //:: error: (assignment.type.incompatible)
        ctest = upure;

        stest = umixed;
        //:: error: (assignment.type.incompatible)
        ctest = umixed;

        stest = spure;
        //:: error: (assignment.type.incompatible)
        ctest = spure;

        stest = smixed;
        //:: error: (assignment.type.incompatible)
        ctest = smixed;

        stest = bmixed;
        //:: error: (assignment.type.incompatible)
        ctest = bmixed;
    }

    public void ShortRangeRules(
            @IntRange(from = 0, to = 32767) short c,
            @IntRange(from = 32768, to = 65535) short upure,
            @IntRange(from = 0, to = 32768) short umixed,
            @IntRange(from = -32768, to = -1) short spure,
            @IntRange(from = -1, to = 32767) short smixed,
            @IntRange(from = -32768, to = 32768) short bmixed) {
        @Signed short stest;
        @Constant short ctest;

        ctest = c;

        stest = upure;
        //:: error: (assignment.type.incompatible)
        ctest = upure;

        stest = umixed;
        //:: error: (assignment.type.incompatible)
        ctest = umixed;

        stest = spure;
        //:: error: (assignment.type.incompatible)
        ctest = spure;

        stest = smixed;
        //:: error: (assignment.type.incompatible)
        ctest = smixed;

        stest = bmixed;
        //:: error: (assignment.type.incompatible)
        ctest = bmixed;
    }

    public void IntRangeRules(
            @IntRange(from = 0, to = 2147483647) int c,
            @IntRange(from = 2147483648L, to = 4294967295L) int upure,
            @IntRange(from = 0, to = 2147483648L) int umixed,
            @IntRange(from = -2147483648, to = -1) int spure,
            @IntRange(from = -1, to = 2147483647) int smixed,
            @IntRange(from = -2147483648, to = 2147483648L) int bmixed) {
        @Signed int stest;
        @Constant int ctest;

        ctest = c;

        stest = upure;
        //:: error: (assignment.type.incompatible)
        ctest = upure;

        stest = umixed;
        //:: error: (assignment.type.incompatible)
        ctest = umixed;

        stest = spure;
        //:: error: (assignment.type.incompatible)
        ctest = spure;

        stest = smixed;
        //:: error: (assignment.type.incompatible)
        ctest = smixed;

        stest = bmixed;
        //:: error: (assignment.type.incompatible)
        ctest = bmixed;
    }

    public void LongRangeRules(
            @IntRange(from = 0, to = Long.MAX_VALUE) long c,
            @IntRange(from = Long.MIN_VALUE, to = -1) long spure,
            @IntRange(from = -1, to = Long.MAX_VALUE) long smixed,
            @IntRange(from = Long.MIN_VALUE, to = Long.MAX_VALUE) long bmixed) {
        @Signed long stest;
        @Constant long ctest;

        ctest = c;

        stest = spure;
        //:: error: (assignment.type.incompatible)
        ctest = spure;

        stest = smixed;
        //:: error: (assignment.type.incompatible)
        ctest = smixed;

        stest = bmixed;
        //:: error: (assignment.type.incompatible)
        ctest = bmixed;
    }
}
