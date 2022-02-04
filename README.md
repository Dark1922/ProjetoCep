 <h2 align="center">🚀 # Projeto de Frete</h2>

![image](https://user-images.githubusercontent.com/48605830/152583270-ba24ad67-a746-42c2-b0fd-7ecf31aa5fa7.png)

<h3 align="center"> 📑 # Objetivo<h3>
 
 <dl>
<dd>Implementar para empresa de transporte de cargas SigaBem o endpoint para o cálculo do preço do frete:</dd>

<dd>Você deve calcular o valor total do frete e a data prevista da entrega.</dd>

<dd>Considerar regras para calcular o valor do frete:</dd>

- CEPs com DDDs iguais tem 50% de desconto no valor do frete e entrega prevista de 1 dia
- CEPs de estados iguais tem 75% de desconto no valor do frete e entrega prevista de 3 dias
- CEPs de estados diferentes não deve ser aplicado o desconto no valor do frete e entrega prevista de 10 dias
- O valor do frete é cobrado pelo peso da encomenda, o valor para cada KG é R$1,00
- Seu input de entrada deve ser “peso”, “cepOrigem”, “cepDestino” e “nomeDestinatario“

<dt>Você utilizará a API gratuita de consulta de CEP abaixo: Documentação da API: https://viacep.com.br/ Exemplo do GET: https://viacep.com.br/ws/<CEP_A_CONSULTAR>/json/</dt>

<p>Endpoint pode ser público Response/Output deve possuir: “vlTotalFrete” e “dataPrevistaEntrega”, “cepOrigem” e “cepDestino” Deve ser persistido no banco os valores da cotação os valores consultados: “peso”, “cepOrigem”, “cepDestino”, “nomeDestinatario”, “vlTotalFrete”, “dataPrevistaEntrega” e “dataConsulta”</p>
 </dl>
