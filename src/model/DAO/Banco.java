
package model.DAO;

import java.text.ParseException;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.Usuario;
import java.util.ArrayList;


public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia() throws ParseException{
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "barbeiro",  "09/05/1996", "30212121", "barbeiro@barbershop.com",'M', "barbeiro", "administrador");
        Usuario usuario2 = new Usuario(2, "estagiario", "09/05/1996", "30212122", "estagiario@barbershop.com",'M', "estagiario", "funcionario");
         
        Cliente cliente1 = new Cliente(1, "Alan Figueiredo", 'M', "30/01/1995", "tiagoluz.h607@gmail.com", "5142487", "Rua jaboti 35 Canudos NH");
        Cliente cliente2 = new Cliente(2, "Judite Oliveira", 'F', "30/08/1994", "juditeoliveirapet@gmail.com", "5142487745", "Rua campo bom 78 Centro NH");
        Cliente cliente3 = new Cliente(3, "Paulo Ricado", 'M', "24/04/1997", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH");
        Cliente cliente4 = new Cliente(4, "Neymar Santos", 'M', "20/08/1995",  "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH");
        Cliente cliente5 = new Cliente(5, "Debruine Pipoqueiro", 'M', "13/09/1992", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica");
        Cliente cliente6 = new Cliente(6, "Matuidi Pareira", 'M', "17/08/1994", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca");
        Cliente cliente7 = new Cliente(7, "Marta de Souza", 'F', "25/03/1993", "martasouzapet@gmail.com", "4658237314", "Rua tesla 215 Canudos NH");
        Cliente cliente8 = new Cliente(8, "Aline Ferrari", 'F', "04/03/1990",  "alineferraripet@gmail.com", "8475123687", "Rua hyrule 32 Canudos NH");
        Cliente cliente9 = new Cliente(9, "Samuel Coltinho", 'M', "09/02/1998", "samuelcoltinhopet@gmail.com", "74595142487", "Rua floresta 12 Canudos NH");
        Cliente cliente10 = new Cliente(10, "Felipe Luis", 'M', "12/06/1999",  "felipeluispet@gmail.com", "845713647", "Rua marechal 1023 Canudos NH");
        
        Servico servico1 = new Servico(1, "Corte Simples", 18);
        Servico servico2 = new Servico(2, "Corte Degrade", 30);
        Servico servico3 = new Servico(3, "Barba Simples", 15);
        Servico servico4 = new Servico(4, "Barba Desenhada", 25);
        Servico servico5 = new Servico(5, "Sombrancelhas", 10);
        Servico servico6 = new Servico(6, "Penteados", 3);

        Agendamento agendamento1 = new Agendamento(1, cliente1, servico2, 30, "14/07/2018 9:30");
        Agendamento agendamento2 = new Agendamento(2, cliente3, servico4, 40, "14/07/2018 11:00");
        Agendamento agendamento3 = new Agendamento(3, cliente4, servico1, 18, "14/07/2018 10:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
