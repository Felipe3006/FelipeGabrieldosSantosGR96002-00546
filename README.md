
**Projeto: Gerenciador de Lojas de um Shopping Center**

**Introdução:**
O Gerenciador de Lojas de um Shopping Center é um projeto abrangente que visa simplificar e otimizar a administração das diversas lojas presentes em um shopping. A estrutura do shopping é representada por uma matriz de espaços disponíveis para locação, onde cada quadrado representa um espaço que pode ser alugado por uma loja específica. O sistema desenvolvido proporciona um controle eficiente sobre as lojas, permitindo a realização de alterações, a geração de relatórios e a gestão completa dos aspectos relacionados a cada estabelecimento.

**Etapas de Desenvolvimento:**

**Etapa 1 | Criação de Classes:**
Na primeira etapa, foram criadas classes para representar os elementos essenciais do sistema. Dentre elas, destacam-se a classe `Shopping`, que representa o shopping como um todo, e a classe `Loja`, que encapsula as características individuais de cada estabelecimento. Cada espaço disponível no shopping é representado por uma instância da classe `Espaco`.

**Etapa 2 | Associação entre Classes:**
A segunda etapa do desenvolvimento concentrou-se na associação entre as classes para estabelecer as relações necessárias para o funcionamento do sistema. A classe `Shopping` possui uma associação com a classe `Loja`, permitindo que cada espaço no shopping seja ocupado por uma loja específica. Isso possibilita um gerenciamento eficiente das lojas presentes no estabelecimento.

**Etapa 3 | Herança e Polimorfismo:**
A terceira etapa introduziu conceitos de herança e polimorfismo para aprimorar a estrutura do sistema. A classe base `Loja` foi estendida por subclasses que representam diferentes segmentos, como vestuário, alimentação, lazer, cinema, serviços, entre outros. Isso permite uma gestão mais especializada e personalizada de cada tipo de loja, aproveitando as características específicas de cada segmento.

**Etapa 4 | Arrays:**
A última etapa envolveu a implementação de arrays para facilitar o armazenamento e manipulação de dados. Os espaços disponíveis no shopping foram organizados em uma matriz, proporcionando uma representação eficiente da estrutura do estabelecimento. Isso facilita a alocação e desalocação de espaços, além de permitir a realização de consultas e a geração de relatórios baseados na disposição física das lojas no shopping.

**Funcionalidades Principais:**
1. **Cadastro de Lojas:** Registro e cadastramento de novas lojas no sistema, associando-as aos espaços disponíveis.
2. **Alterações nas Lojas:** Possibilidade de realizar alterações nos dados das lojas, como mudança de segmento, nome ou localização.
3. **Relatórios:** Geração de relatórios detalhados sobre a ocupação dos espaços, segmentação das lojas e desempenho do shopping.
4. **Gestão de Espaços:** Alocação e desalocação eficiente de espaços, considerando a disponibilidade e características específicas de cada local.

**Conclusão:**
O Gerenciador de Lojas de um Shopping Center é uma solução abrangente que visa facilitar a administração de um ambiente comercial diversificado. Com a implementação de classes, associações, herança, polimorfismo e o uso eficiente de arrays, o sistema proporciona um controle robusto sobre as lojas, permitindo uma gestão eficaz e a geração de insights valiosos para a administração do shopping.
