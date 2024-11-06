Sistema de Gestão de Frota de Veículos Elétricos
Este projeto é uma aplicação em Java desenvolvida para gerenciar uma frota de veículos elétricos, motoristas, viagens e eletropostos. O sistema permite gerenciar informações como autonomia dos veículos, histórico de recargas, listagem de veículos com baixa autonomia, necessidade de manutenção e mais.

Estrutura do Projeto
1. Classe VeiculosEletricos
A classe VeiculosEletricos é a base para os veículos elétricos na frota, contendo atributos e métodos relacionados à autonomia e recarga de bateria:

Atributos:

id: Identificador único do veículo.
marca e modelo: Informações de identificação.
anoFabricacao: Ano de fabricação.
capacidadeBateria e autonomiaMaxima: Capacidade máxima da bateria e autonomia total do veículo.
autonomiaAtual: Quantidade de autonomia restante.
historicoRecargas: Registra as recargas feitas no veículo.
Métodos:

recarregarBateria(double kWh): Recarrega a bateria e atualiza o histórico.
precisaRecarregar(): Verifica se a autonomia atual está abaixo de 20%.
consultarHistoricoRecargas(): Exibe o histórico de recargas do veículo.
setCapacidadeBateria e setAutonomiaMaxima: Ajusta valores específicos para diferentes tipos de veículos.
2. Classes CarrosCompactos, CarrosSedans e SuvEletricos
Essas classes herdam de VeiculosEletricos, representando diferentes tipos de veículos com tempos de carga específicos:

Atributos: Cada classe define um tempo de carga padrão para o tipo de carro que representa (tempoCargaCompacto, tempoCargaSedan, tempoCargaSuv).
3. Classe Eletroposto
Representa um ponto de carregamento para veículos elétricos.

Atributos:

id: Identificador do eletroposto.
local: Localização do eletroposto.
vagasDisponiveis: Número de vagas de carregamento disponíveis.
tempoCarregamento: Tempo necessário para recarga.
Métodos:

temVagaDisponivel(): Retorna se há vagas para recarga.
ocuparVaga() e liberarVaga(): Atualizam o número de vagas disponíveis no eletroposto.
4. Classe GestaoFrota
A classe central que gerencia os veículos, motoristas e eletropostos.

Atributos:

listaVeiculos: Armazena os veículos da frota.
listaMotoristas: Armazena os motoristas registrados.
listaEletropostos: Armazena os eletropostos.
Métodos:

veiculosComBaixaAutonomia(): Lista veículos com autonomia baixa (necessitam de recarga).
listarVeiculosParaManutencao(): Lista veículos com autonomia abaixo de 10% da capacidade.
5. Classe Motorista
Representa um motorista registrado no sistema.

Atributos:

nome, id, numeroHabilitacao, nivelExperiencia: Informações de identificação e experiência.
historicoViagens: Registra as viagens feitas pelo motorista.
Métodos:

registrarViagem(Viagem viagem): Adiciona uma viagem ao histórico do motorista.
listarViagens(): Exibe o histórico de viagens.
6. Classe Viagem
Representa uma viagem realizada por um motorista com um veículo específico.

Atributos:

motorista, veiculo, distancia, destino: Informações da viagem.
paradasEletroposto: Registra as paradas de recarga.
Métodos:

adicionarParada(Eletroposto e): Adiciona uma parada de recarga ao histórico.
realizarViagem(ArrayList<Eletroposto> listaEletropostos): Realiza a viagem, ajustando a autonomia do veículo e planejando paradas para recarga, caso necessário.
7. Classe Principal
Classe principal que contém o método main, onde o sistema é inicializado e executado.

Funções principais:
Instancia a GestaoFrota, motoristas, veículos e eletropostos.
Cria e realiza uma viagem, imprimindo o status da frota e das viagens.
