package howto;

import java.io.Serializable;

public class ClassSerializable implements Serializable {
    transient int life;
    static int staticField;
    AnotherClassSerializable anotherClassSerializable;
}
