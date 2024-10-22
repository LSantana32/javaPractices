import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DirectorioTelefonico {
    private HashMap<Integer, Cliente> directorio;

    public DirectorioTelefonico() {
        directorio = new HashMap<>();
    }

    public void agregarCliente(Integer telefono, Cliente cliente){
        directorio.put(telefono, cliente);
    }

    public Cliente buscarCliente(Integer telefono){
        return directorio.get(telefono);
    }

    public List<Integer> buscarTelefono(String apellido){
        List<Integer> telefonos= new ArrayList<>();
        directorio.forEach((telefono, cliente) -> {
            if(cliente.getApellido().equals(apellido)){
                telefonos.add(telefono);
            }
        });
        return telefonos;
    }

    public List<Cliente> buscarCliente(String ciudad){
        List<Cliente> clientes = new ArrayList<>();
        directorio.forEach((telefono, cliente)->{
            if (cliente.getCiudad().equals(ciudad)){
                clientes.add(cliente);
            }});
        return clientes;
    }

    public void eliminarCliente(Integer telefono){
        directorio.remove(telefono);
    }


}
