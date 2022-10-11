import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AluguelCarroBuilderTest {

    @Test
    void deveVerificarCampoStringObrigatorio() {
        try {
            AluguelCarroBuilder aluguelCarroBuilder = new AluguelCarroBuilder();
            aluguelCarroBuilder.setModelo("modelo").build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Campo obrigatorio - Marca", e.getMessage());
        }
    }

    @Test
    void deveVerificarCampoNumberObrigatorio() {
        try {
            AluguelCarroBuilder aluguelCarroBuilder = new AluguelCarroBuilder();
            aluguelCarroBuilder
                    .setModelo("modelo")
                    .setMarca("marca")
                    .setPlaca("placa")
                    .setNomeLocatario("nome")
                    .setCpfLocatario("cpf")
                    .build();


            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Campo obrigatorio - Idade Locatario", e.getMessage());
        }
    }

    @Test
    void deveVerificarIdadeMinima() {
        Date tomorrow = new Date(new Date().getTime() + (1000 * 60 * 60 * 24));

        try {
            AluguelCarroBuilder aluguelCarroBuilder = new AluguelCarroBuilder();
            aluguelCarroBuilder
                    .setModelo("modelo")
                    .setMarca("marca")
                    .setPlaca("placa")
                    .setNomeLocatario("nome")
                    .setCpfLocatario("cpf")
                    .setIdadeLocatario(17)
                    .setPrecoDiario(130)
                    .setDataTermino(tomorrow)
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Idade minima de 18 anos", e.getMessage());
        }
    }

    @Test
    void deveVerificarDataTerminoMaiorQueDataInicio() {
        Date yesterday = new Date(new Date().getTime() - (1000 * 60 * 60 * 24));

        try {
            AluguelCarroBuilder aluguelCarroBuilder = new AluguelCarroBuilder();
            aluguelCarroBuilder
                    .setModelo("modelo")
                    .setMarca("marca")
                    .setPlaca("placa")
                    .setNomeLocatario("nome")
                    .setCpfLocatario("cpf")
                    .setIdadeLocatario(20)
                    .setPrecoDiario(130)
                    .setDataTermino(yesterday)
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data termino anterior a data inicio", e.getMessage());
        }
    }

    @Test
    void deveRetornarUmAluguelCarroValido() {
        Date tomorrow = new Date(new Date().getTime() + (1000 * 60 * 60 * 24));

        AluguelCarroBuilder aluguelCarroBuilder = new AluguelCarroBuilder();
        AluguelCarro aluguelCarro = aluguelCarroBuilder
                .setModelo("modelo")
                .setMarca("marca")
                .setPlaca("placa")
                .setNomeLocatario("nome")
                .setCpfLocatario("cpf")
                .setIdadeLocatario(20)
                .setPrecoDiario(130)
                .setDataTermino(tomorrow)
                .build();

        assertNotNull(aluguelCarro);
    }

}