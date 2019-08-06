package teste.builder;

import modelo.Convenio;

public class ConvenioBuilder {

    public static Convenio SIAPE(){
        Convenio convenio = new Convenio();
        convenio.setDescricao("SIAPE");
        convenio.setId(1L);
        return convenio;
    }

    public static Convenio INSS(){
        Convenio convenio = new Convenio();
        convenio.setId(2L);
        convenio.setDescricao("INSS");
        return convenio;
    }
}
