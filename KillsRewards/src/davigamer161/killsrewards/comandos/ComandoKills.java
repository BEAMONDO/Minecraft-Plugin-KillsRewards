package davigamer161.killsrewards.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import davigamer161.killsrewards.KillsRewards;


public class ComandoKills implements CommandExecutor{

    private KillsRewards plugin;

    public ComandoKills(KillsRewards plugin){
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        
        if(!(sender instanceof Player)){
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"["+ChatColor.YELLOW+plugin.nombre+ChatColor.RED+"] "+ChatColor.WHITE+" No puedes ejecutar este comando desde la consola");
            return false;
        }
        else{
            Player jugador = (Player) sender;
            
            if(!config.contains("Players")){
                String mensaje = messages.getString("Messages.mensaje-no-mob-kill");
                jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', mensaje));
                return true;
            }if(args.length > 0){
                if(args[0].equalsIgnoreCase("player")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-player-kill");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".player_kills")){
                            int cantidadPlayers = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".player_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadPlayers));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-player-kill");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("zombie")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".zombie_kills")){
                            int cantidadZombie = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".zombie_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadZombie));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("skeleton")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".skeleton_kills")){
                            int cantidadSkeleton = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".skeleton_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadSkeleton));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("spider")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".spider_kills")){
                            int cantidadSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".spider_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadSpider));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("cavespider")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".cave_spider_kills")){
                            int cantidadCaveSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".cave_spider_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadCaveSpider));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("creeper")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".creeper_kills")){
                            int cantidadCreeper = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".creeper_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadCreeper));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("witch")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".witch_kills")){
                            int cantidadWitch = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".witch_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadWitch));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("blaze")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".blaze_kills")){
                            int cantidadBlaze = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".blaze_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadBlaze));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("enderman")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".enderman_kills")){
                            int cantidadEnderman = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".enderman_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadEnderman));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("endermite")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".endermite_kills")){
                            int cantidadEndermite = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".endermite_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadEndermite));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("ghast")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".ghast_kills")){
                            int cantidadGhast = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".ghast_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadGhast));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("guardian")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".guardian_kills")){
                            int cantidadGuardian = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".guardian_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadGuardian));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("iron_golem")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".iron_golem_kills")){
                            int cantidadIronGolem = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".iron_golem_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadIronGolem));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("magma_cube")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".magma_cube_kills")){
                            int cantidadMagmaCube = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".magma_cube_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadMagmaCube));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("silverfish")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".silverfish_kills")){
                            int cantidadSilverfish = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".silverfish_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadSilverfish));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("slime")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".slime_kills")){
                            int cantidadSlime = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".slime_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadSlime));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("wither")){
                    if(!config.contains("Players")){
                        String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".wither_kills")){
                            int cantidadWither = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".wither_kills"));
                            String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadWither));
                            return true;
                        }else{
                            String texto = messages.getString("Messages.mensaje-no-mob-kill-unico");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            return true;
                        }
                    }
                }
                }else{
                    jugador.sendMessage(ChatColor.BLUE+"<-----------------"+ChatColor.GREEN+"KILLS"+ChatColor.BLUE+"----------------->");
                if(config.contains("Players."+jugador.getUniqueId()+".zombie_kills")){
                    int cantidadZombie = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".zombie_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadZombie+ChatColor.WHITE+" zombie"));
                }if(config.contains("Players."+jugador.getUniqueId()+".skeleton_kills")){
                    int cantidadSkeleton = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".skeleton_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadSkeleton+ChatColor.WHITE+" esqueletos"));
                }if(config.contains("Players."+jugador.getUniqueId()+".spider_kills")){
                    int cantidadSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".spider_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadSpider+ChatColor.WHITE+" arañas"));
                }if(config.contains("Players."+jugador.getUniqueId()+".cave_spider_kills")){
                    int cantidadCaveSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".cave_spider_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadCaveSpider+ChatColor.WHITE+" arañas de cueva"));
                }if(config.contains("Players."+jugador.getUniqueId()+".creeper_kills")){
                    int cantidadCreeper = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".creeper_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadCreeper+ChatColor.WHITE+" creepers"));
                }if(config.contains("Players."+jugador.getUniqueId()+".witch_kills")){
                    int cantidadWitch = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".witch_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadWitch+ChatColor.WHITE+" brujas"));
                }if(config.contains("Players."+jugador.getUniqueId()+".enderman_kills")){
                    int cantidadEnderman = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".enderman_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadEnderman+ChatColor.WHITE+" endermans"));
                }if(config.contains("Players."+jugador.getUniqueId()+".endermite_kills")){
                    int cantidadEndermite = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".endermite_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadEndermite+ChatColor.WHITE+" endermites"));
                }if(config.contains("Players."+jugador.getUniqueId()+".ghast_kills")){
                    int cantidadGhast = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".ghast_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadGhast+ChatColor.WHITE+" ghasts"));
                }if(config.contains("Players."+jugador.getUniqueId()+".guardian_kills")){
                    int cantidadGuardian = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".guardian_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadGuardian+ChatColor.WHITE+" guardianes"));
                }if(config.contains("Players."+jugador.getUniqueId()+".iron_golem_kills")){
                    int cantidadIronGolem = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".iron_golem_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadIronGolem+ChatColor.WHITE+" golems de hierro"));
                }if(config.contains("Players."+jugador.getUniqueId()+".magma_cube_kills")){
                    int cantidadMagmaCube = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".magma_cube_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadMagmaCube+ChatColor.WHITE+" cubos de magma"));
                }if(config.contains("Players."+jugador.getUniqueId()+".silverfish_kills")){
                    int cantidadSilverfish = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".silverfish_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadSilverfish+ChatColor.WHITE+" lepismas"));
                }if(config.contains("Players."+jugador.getUniqueId()+".slime_kills")){
                    int cantidadSlime = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".slime_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadSlime+ChatColor.WHITE+" slimes"));
                }if(config.contains("Players."+jugador.getUniqueId()+".wither_kills")){
                    int cantidadWither = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".wither_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadWither+ChatColor.WHITE+" withers"));
                }if(config.contains("Players."+jugador.getUniqueId()+".blaze_kills")){
                    int cantidadBlaze = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".blaze_kills"));
                    String matado = messages.getString("Messages.mensaje-matado");
                            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', matado+cantidadBlaze+ChatColor.WHITE+" blazes"));
                }
                return true;
            }
        }
        return false;
    }
}
