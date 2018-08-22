package howto;

class Parent {
    static {
        System.out.println("Static block in Parent class");
    }

    Parent() {
        System.out.println("Parent class Constructor()");
    }

    {
        System.out.println("Simple block in Parent class");
    }
}

public class InitializationBlocks extends Parent {
    static {
        System.out.println("Static block in InitializationBlocks class");
    }

    {
        System.out.println("Simple block 1 in InitializationBlocks class");
    }

    {
        System.out.println("Simple block 2 in InitializationBlocks class");
    }

    InitializationBlocks() {
//        super();
        System.out.println("InitializationBlocks class Constructor()");
    }

    public static void main(String[] args) {
        new InitializationBlocks();
    }

    {
        System.out.println("Simple block 3 in InitializationBlocks class");
    }

    static {
        System.out.println("Static block 2 in InitializationBlocks class");
    }
}
