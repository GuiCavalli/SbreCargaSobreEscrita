
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.unipar.SobreEscrita.Moto;
import br.unipar.SobreEscrita.Carro;

public class SobreEscritaTest {

    @Test
    public void testarDescricaoCarro() {
        Carro carro = new Carro();
        String descricaoEsperada = "Carro pequeno";
        assertEquals(descricaoEsperada, carro.descricao());
    }

    @Test
    public void testarDescricaoMoto() {
        Moto moto = new Moto();
        String descricaoEsperada = "Moto Pequena";
        assertEquals(descricaoEsperada, moto.descricao());
    }

}
