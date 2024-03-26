package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import runner.RunCucumber;
import support.Commands;
import support.Utils;

import static support.Commands.*;

public class CadastroUsuarioPage extends RunCucumber {

    // elementos
    private By campoNome = By.id("user");
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("password");
    private By botaoFazerCadastro = By.id("btnRegister");


    // ações / funções / métodos
    public void preencheNome(String nome) {
        FillField(campoNome, nome);

    }

    public void preencheEmail(String email) {
        FillField(campoEmail, email);
    }

    public void preencherSenha(String senha) {
        FillField(campoSenha, senha);
    }

    public void cadastrarUsuario() {
        clickElement(botaoFazerCadastro);
    }


    public void verificaCadastroSucesso() {
        checkMessage(By.id("swal2-title"),"Cadastro realizado!");
    }
}
