/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */


function confirmarReserva(event) {
            event.preventDefault(); // Impede o envio real do formulário

            // Coleta os valores dos campos
            const areaLazer = document.getElementById("areaLazer").value;
            const dataReserva = document.getElementById("dataReserva").value;
            const nomeMorador = document.getElementById("nomeMorador").value;

            // Exibe a mensagem de confirmação
            const mensagem = `
                Reserva Confirmada!<br><br>
                Nome do Morador: ${nomeMorador}<br>
                Área de Lazer: ${areaLazer}<br>
                Data da Reserva: ${dataReserva}
            `;

            // Exibe a mensagem na área de confirmação
            document.getElementById("mensagemConfirmacao").innerHTML = mensagem;
        }
        
        function buscarEncomenda() {
            const searchInput = document.getElementById("busca").value.toLowerCase(); // Obtém o valor da busca
            const encomendas = document.querySelectorAll(".encomenda");

            encomendas.forEach(encomenda => {
                const nomeMorador = encomenda.querySelector(".nomeMorador").textContent.toLowerCase();
                const apartamento = encomenda.querySelector(".apartamento").textContent.toLowerCase();
                const dataEntrega = encomenda.querySelector(".dataEntrega").textContent.toLowerCase();

                // Verifica se o texto de busca está presente em algum campo
                if (nomeMorador.includes(searchInput) || apartamento.includes(searchInput) || dataEntrega.includes(searchInput)) {
                    encomenda.style.display = "block"; // Exibe a encomenda se corresponder à busca
                } else {
                    encomenda.style.display = "none"; // Oculta a encomenda se não corresponder
                }
            });
        }
        
       
        