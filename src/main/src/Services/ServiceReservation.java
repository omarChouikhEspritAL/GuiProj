package Services;

import Entitie.Reservation;
import Utils.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class ServiceReservation implements IService<Reservation> {
    private Connection connection= DataSource.getInstance().getCon();
    private Statement statement;
    public ServiceReservation(){
        try {
            statement= connection.createStatement();
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }
    @Override
    public void ajouter(Reservation reservation) throws SQLException {
        String query = "insert into reservations values(NULL,reservation.getDateDebut,reservation.getDateFin,reservation.getNombrePassages,reservation.getId_offre,reservation.getId_membre)";
        int res = statement.executeUpdate(query);
        System.out.println("nombre de tuple ajoutés: "+res);
    }

    @Override
    public void update(Reservation t) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public ArrayList<Reservation> readAll() throws SQLException {
        ArrayList<Reservation>reservations = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery("select * from reservations");
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                Date dateDebut = resultSet.getDate(2);
                Date dateFin= resultSet.getDate(3);
                int nombrePassages = resultSet.getInt(4);
                int id_offre=resultSet.getInt(5);
                int id_membre=resultSet.getInt(6);
                reservations.add(new Reservation(id,dateDebut,dateFin,nombrePassages,id_offre,id_membre));
            }
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public ArrayList<Reservation> readAllById(int idM) throws SQLException {
        ArrayList<Reservation>reservations = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery("select * from reservations where id_membre="+idM);
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                Date dateDebut = resultSet.getDate(2);
                Date dateFin= resultSet.getDate(3);
                int nombrePassages = resultSet.getInt(4);
                int id_offre=resultSet.getInt(5);
                int id_membre=resultSet.getInt(6);
                reservations.add(new Reservation(id,dateDebut,dateFin,nombrePassages,id_offre,id_membre));
            }
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public Reservation get(int id) throws SQLException {
        return null;
    }
}
