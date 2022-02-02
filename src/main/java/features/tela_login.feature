#language: pt

Funcionalidade: Tela de Login
  Cenário: Logar a Pagina Principal

  Esquema do Cenário: Casos de Teste Com Sucesso

    Dado que o usuario esta na tela de login
    Quando preenche o campo Username com <nome>
    E o campo Password com <senha>
    E clica no botão de Login
    Então deve ter acesso a Pagina <titulo>


    Exemplos:

      | nome                        | senha          | titulo                    |
      |"standard_user"              |"secret_sauce"  |"react-burger-menu-btn"    |
      |"performance_glitch_user"    |"secret_sauce"  |"react-burger-menu-btn"    |
      |"problem_user"               |"secret_sauce"  |"react-burger-menu-btn"    |

  Esquema do Cenário: Casos de Teste Com Falha

    Dado que o usuario esta na tela de login
    Quando preenche o campo Username com <nome>
    E o campo Password com <senha>
    E clica no botão de Login
    Então deve ter acesso a Pagina <classe>

    Exemplos:

      | nome                        | senha          | classe                          |
      |"loqued_out_user"            |"secret_sauce"  |"error-message-container error"  |
      |"standard_user"              |"molhosecreto"  |"error-message-container error"  |
      |"performance_glitch_user"    |"molhosecreto"  |"error-message-container error"  |
      |"loqued_out_user"            |"molhosecreto"  |"error-message-container error"  |
      |"problem_user"               |"molhosecreto"  |"error-message-container error"  |
      |"secret_sauce"               |"secret_sauce"  |"error-message-container error"  |
      |"123456789"                  |"secret_sauce"  |"error-message-container error"  |
      |"abcdef"                     |"secret_sauce"  |"error-message-container error"  |
      |""                           |"secret_sauce"  |"error-message-container error"  |
      |"standard_user"              |""              |"error-message-container error"  |
      |"123456"                     |"123456"        |"error-message-container error"  |
      |"abcdef"                     |"abcdef"        |"error-message-container error"  |