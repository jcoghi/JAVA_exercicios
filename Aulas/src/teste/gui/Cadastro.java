package teste.gui;

/**
 *
 * @author joaof
 */
public enum Cadastro {

    JOAO("Joao", "41"),
    FELIPE("Felipe", "28"),
    MIGUEL("Miguel", "5");

    private String name;
    private String age;

    private Cadastro(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
    
    

}
