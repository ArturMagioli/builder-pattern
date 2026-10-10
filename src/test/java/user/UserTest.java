package user;

import com.magioli.entities.Curriculo;
import com.magioli.entities.Endereco;
import com.magioli.entities.User;
import com.magioli.enums.Permissao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//testes utilizando o builder
public class UserTest {

    private Endereco end;
    private Curriculo cv;

    @BeforeEach
    public void configurarEnderecoECurriculo() {
        end = new Endereco("23042-650", "Rua ipê amarelo", 25);
        cv = new Curriculo("https://github.com/brunohs",
                "https://linkedin/brunohs",
                "Desenvolvimento de software, Pensamento crítico, colaboração em equipe",
                "Atuei como freelancer no desenvolvimento de sistemas para instituições públicas e privadas.");
    }

    @Test
    public void candidatoEstaAtivoEComCurriculo() {
        User user = new User.UserBuilder()
                .nome("Bruno Henrique Santos")
                .email("bruno@gmail.com")
                .comPermissao(Permissao.CANDIDATO)
                .ativo()
                .curriculo(cv)
                .build();
        assert (user.getPermissao().equals(Permissao.CANDIDATO) && user.isAtivo() && user.getCurriculo() != null);
    }

    //sem obrigação de lembrar a ordem dos construtores, sem obrigação de passar null, mais legível.
    @Test
    public void usuarioInativoSemCurriculoEnderecoTelefone() {
        User user = new User.UserBuilder()
                .nome("Bruno Henrique Santos")
                .email("bruno@gmail.com")
                .comPermissao(Permissao.CANDIDATO)
                .inativo()
                .build();
        assert (!user.isAtivo() && user.getCurriculo() == null && user.getEndereco() == null);
    }
}
