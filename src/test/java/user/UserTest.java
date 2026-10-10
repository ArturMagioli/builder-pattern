package user;

import com.magioli.entities.Curriculo;
import com.magioli.entities.Endereco;
import com.magioli.entities.User;
import com.magioli.enums.Permissao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//testes utilizando todos os construtores
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
    public void usuarioAtivoSemCurriculoEnderecoTelefone() {
        User user = new User("Bruno Henrique Santos", "bruno@gmail.com", null, true, Permissao.CANDIDATO, null, null);
    }

    @Test
    public void usuarioAtivoPossuiCurriculo() {
        User user = new User("Bruno Henrique Santos", "bruno@gmail.com", cv, true, Permissao.CANDIDATO, "21547854785");
        assert (user.isAtivo() && user.getCurriculo() != null);
    }

    @Test
    public void usuarioAtivoSemCurriculo() {
        User user = new User("Bruno Henrique Santos", "bruno@gmail.com", true, Permissao.CANDIDATO, "21547854785", end);
        assert (user.isAtivo() && user.getCurriculo() == null);
    }

    @Test
    public void usuarioInativoSemCurriculoEEndereco() {
        User user = new User("Bruno Henrique Santos", "bruno@gmail.com", false, Permissao.CANDIDATO, "21547854785");
        assert (user.getCurriculo() == null && user.getEndereco() == null);
    }

    @Test
    public void usuarioInativoComCurriculoEEndereco() {
        User user = new User("Bruno Henrique Santos", "bruno@gmail.com", cv, false, Permissao.CANDIDATO, "21547854785", end);
        assert (!user.isAtivo() && user.getCurriculo() != null && user.getEndereco() != null);
    }
}
