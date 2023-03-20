package davigamer161.killsrewards.comandos;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import davigamer161.killsrewards.KillsRewards;


public class ComandoPrincipal implements CommandExecutor{

    private KillsRewards plugin;

    public ComandoPrincipal(KillsRewards plugin){
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
        if(!(sender instanceof Player)){
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"["+ChatColor.YELLOW+plugin.nombre+ChatColor.RED+"] "+ChatColor.WHITE+" No puedes ejecutar este comando desde la consola");
            return false;
        }
        else{
            Player jugador = (Player) sender;
            FileConfiguration config = plugin.getConfig();
            FileConfiguration messages = plugin.getMessages();
            if(args.length > 0){
//-------------------------------------Comando version----------------------------------------------------------//
//----------------------------------------Desde aqui---------------------------------------//
            if(args[0].equalsIgnoreCase("version")){
                if(sender instanceof Player && (jugador.hasPermission("killsrewards.admin"))){
                    String path = "Config.mensaje-version";
                    if(config.getString(path).equals("true")){
                        List<String> mensaje = messages.getStringList("Messages.killsrewards-version");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto.replaceAll("%player%", jugador.getName()).replaceAll("%plugin%", plugin.nombre).replaceAll("%version%", plugin.version)));
                            }
                    }
                }
                if(sender instanceof Player && !(jugador.hasPermission("killsrewards.admin"))){
                    String path = "Config.mensaje-version";
                    if(config.getString(path).equals("true")){
                        List<String> mensaje = messages.getStringList("Messages.killsrewards-noperm");
                        for(int i=0;i<mensaje.size();i++){
                            String texto = mensaje.get(i);
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto.replaceAll("%player%", jugador.getName()).replaceAll("%plugin%", plugin.nombre)));
                        }
                    }
                }
            }else if(args[0].equalsIgnoreCase("ver")){
                if(sender instanceof Player && (jugador.hasPermission("killsrewards.admin"))){
                    String path = "Config.mensaje-version";
                    if(config.getString(path).equals("true")){
                        List<String> mensaje = messages.getStringList("Messages.killsrewards-version");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto.replaceAll("%player%", jugador.getName()).replaceAll("%plugin%", plugin.nombre).replaceAll("%version%", plugin.version)));
                            }
                    }
                }
                if(sender instanceof Player && !(jugador.hasPermission("killsrewards.admin"))){
                    String path = "Config.mensaje-version";
                    if(config.getString(path).equals("true")){
                        List<String> mensaje = messages.getStringList("Messages.killsrewards-noperm");
                        for(int i=0;i<mensaje.size();i++){
                            String texto = mensaje.get(i);
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto.replaceAll("%player%", jugador.getName()).replaceAll("%plugin%", plugin.nombre)));
                        }
                    }
                }
            }
//----------------------------------------Hasta aqui---------------------------------------//

                

//---------------------------------------Comando help--------------------------------------------------------//
//----------------------------------------Desde aqui---------------------------------------//
                else if(args[0].equalsIgnoreCase("help")){
                    if(sender instanceof Player && (jugador.hasPermission("killsrewards.help"))){
                        String path = "Config.mensaje-help";
                        if(config.getString(path).equals("true")){
                            List<String> mensaje = messages.getStringList("Messages.killsrewards-help");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto.replaceAll("%player%", jugador.getName()).replaceAll("%plugin%", plugin.nombre)));
                            }
                        }
                    }else if(sender instanceof Player && !(jugador.hasPermission("killsreward.help"))){
                        List<String> mensaje = messages.getStringList("Messages.killsrewards-noperm");
                        for(int i=0;i<mensaje.size();i++){
                            String texto = mensaje.get(i);
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto.replaceAll("%player%", jugador.getName()).replaceAll("%plugin%", plugin.nombre)));
                        }
                    }
                }
 //----------------------------------------Hasta aqui---------------------------------------//

                

 //--------------------------------------Comando reload---------------------------------------------------------//
 //----------------------------------------Desde aqui---------------------------------------//
 else if(args[0].equalsIgnoreCase("reload")){                    
    if(sender instanceof Player && (jugador.hasPermission("killsrewards.admin"))){
        String path = "Config.mensaje-reload";
        plugin.reloadConfig();
        plugin.reloadMessages();
        if(config.getString(path).equals("true")){
            List<String> mensaje = messages.getStringList("Messages.killsrewards-reload");
            for(int i=0;i<mensaje.size();i++){
                String texto = mensaje.get(i);
                jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto.replaceAll("%player%", jugador.getName()).replaceAll("%plugin%", plugin.nombre)));
            }
        }
    }else if(sender instanceof Player && !(jugador.hasPermission("killsrewards.admin"))){
        List<String> mensaje = messages.getStringList("Messages.killsrewards-noperm");
            for(int i=0;i<mensaje.size();i++){
                String texto = mensaje.get(i);
                jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto.replaceAll("%player%", jugador.getName()).replaceAll("%plugin%", plugin.nombre)));
            }
        }
 //----------------------------------------Hasta aqui---------------------------------------//


                else{
                    jugador.sendMessage(ChatColor.RED+"["+ChatColor.YELLOW+plugin.nombre+ChatColor.RED+"] "+ChatColor.RED+"Ese comando no existe");
                    return true;
                }
           }else{
                jugador.sendMessage(ChatColor.RED+"["+ChatColor.YELLOW+plugin.nombre+ChatColor.RED+"] "+ChatColor.WHITE+" Usa /kr help para ver la lista de comandos");
                return true;
           }
            }  
            return true;
        }
    }
}
