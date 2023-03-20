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
        if(!(sender instanceof Player)){
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"["+ChatColor.YELLOW+plugin.nombre+ChatColor.RED+"] "+ChatColor.WHITE+" No puedes ejecutar este comando desde la consola");
            return false;
        }
        else{
            Player jugador = (Player) sender;
            FileConfiguration config = plugin.getConfig();
            if(!config.contains("Players")){
                jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun mob");
                return true;
            }if(args.length > 0){
                if(args[0].equalsIgnoreCase("player")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun jugador");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".player_kills")){
                            int cantidadPlayers = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".player_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadPlayers+ChatColor.WHITE+" jugadores");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun jugador");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("zombie")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun zombi");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".zombie_kills")){
                            int cantidadZombie = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".zombie_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadZombie+ChatColor.WHITE+" zombis");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun zombi");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("skeleton")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun esqueleto");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".skeleton_kills")){
                            int cantidadSkeleton = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".skeleton_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSkeleton+ChatColor.WHITE+" esqueletos");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun esqueleto");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("spider")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna araña");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".spider_kills")){
                            int cantidadSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".spider_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSpider+ChatColor.WHITE+" arañas");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna araña");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("cavespider")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna araña de cueva");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".cave_spider_kills")){
                            int cantidadCaveSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".cave_spider_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadCaveSpider+ChatColor.WHITE+" arañas de cueva");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna araña de cueva");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("creeper")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun creeper");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".creeper_kills")){
                            int cantidadCreeper = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".creeper_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadCreeper+ChatColor.WHITE+" creepers");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun creeper");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("witch")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna bruja");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".witch_kills")){
                            int cantidadWitch = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".witch_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadWitch+ChatColor.WHITE+" brujas");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna bruja");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("blaze")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun blaze");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".blaze_kills")){
                            int cantidadBlaze = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".blaze_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadBlaze+ChatColor.WHITE+" blazes");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun blaze");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("enderman")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun enderman");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".enderman_kills")){
                            int cantidadEnderman = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".enderman_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadEnderman+ChatColor.WHITE+" endermans");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun enderman");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("endermite")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun endermite");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".endermite_kills")){
                            int cantidadEndermite = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".endermite_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadEndermite+ChatColor.WHITE+" endermites");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun endermite");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("ghast")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun ghast");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".ghast_kills")){
                            int cantidadGhast = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".ghast_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadGhast+ChatColor.WHITE+" ghasts");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun ghast");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("guardian")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun guardian");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".guardian_kills")){
                            int cantidadGuardian = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".guardian_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadGuardian+ChatColor.WHITE+" guardianes");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun guardian");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("iron_golem")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun golem de hierro");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".iron_golem_kills")){
                            int cantidadIronGolem = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".iron_golem_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadIronGolem+ChatColor.WHITE+" golems de hierro");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun golem de hierro");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("magma_cube")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun cubo de magma");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".magma_cube_kills")){
                            int cantidadMagmaCube = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".magma_cube_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadMagmaCube+ChatColor.WHITE+" cubos de magma");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun cubo de magma");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("silverfish")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun lepisma");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".silverfish_kills")){
                            int cantidadSilverfish = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".silverfish_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSilverfish+ChatColor.WHITE+" lepismas");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun lepisma");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("slime")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun slime");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".slime_kills")){
                            int cantidadSlime = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".slime_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSlime+ChatColor.WHITE+" slimes");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun slime");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("wither")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun wither");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".wither_kills")){
                            int cantidadWither = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".wither_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadWither+ChatColor.WHITE+" withers");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun wither");
                            return true;
                        }
                    }
                }
                }else{
                    jugador.sendMessage(ChatColor.BLUE+"<-----------------"+ChatColor.GREEN+"KILLS"+ChatColor.BLUE+"----------------->");
                if(config.contains("Players."+jugador.getUniqueId()+".zombie_kills")){
                    int cantidadZombie = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".zombie_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadZombie+ChatColor.WHITE+" zombie");
                }if(config.contains("Players."+jugador.getUniqueId()+".skeleton_kills")){
                    int cantidadSkeleton = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".skeleton_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSkeleton+ChatColor.WHITE+" esqueletos");
                }if(config.contains("Players."+jugador.getUniqueId()+".spider_kills")){
                    int cantidadSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".spider_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSpider+ChatColor.WHITE+" arañas");
                }if(config.contains("Players."+jugador.getUniqueId()+".cave_spider_kills")){
                    int cantidadCaveSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".cave_spider_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadCaveSpider+ChatColor.WHITE+" arañas de cueva");
                }if(config.contains("Players."+jugador.getUniqueId()+".creeper_kills")){
                    int cantidadCreeper = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".creeper_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadCreeper+ChatColor.WHITE+" creepers");
                }if(config.contains("Players."+jugador.getUniqueId()+".witch_kills")){
                    int cantidadWitch = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".witch_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadWitch+ChatColor.WHITE+" brujas");
                }if(config.contains("Players."+jugador.getUniqueId()+".enderman_kills")){
                    int cantidadEnderman = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".enderman_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadEnderman+ChatColor.WHITE+" endermans");
                }if(config.contains("Players."+jugador.getUniqueId()+".endermite_kills")){
                    int cantidadEndermite = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".endermite_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadEndermite+ChatColor.WHITE+" endermites");
                }if(config.contains("Players."+jugador.getUniqueId()+".ghast_kills")){
                    int cantidadGhast = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".ghast_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadGhast+ChatColor.WHITE+" ghasts");
                }if(config.contains("Players."+jugador.getUniqueId()+".guardian_kills")){
                    int cantidadGuardian = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".guardian_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadGuardian+ChatColor.WHITE+" guardianes");
                }if(config.contains("Players."+jugador.getUniqueId()+".iron_golem_kills")){
                    int cantidadIronGolem = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".iron_golem_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadIronGolem+ChatColor.WHITE+" golems de hierro");
                }if(config.contains("Players."+jugador.getUniqueId()+".magma_cube_kills")){
                    int cantidadMagmaCube = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".magma_cube_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadMagmaCube+ChatColor.WHITE+" cubos de magma");
                }if(config.contains("Players."+jugador.getUniqueId()+".silverfish_kills")){
                    int cantidadSilverfish = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".silverfish_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSilverfish+ChatColor.WHITE+" lepismas");
                }if(config.contains("Players."+jugador.getUniqueId()+".slime_kills")){
                    int cantidadSlime = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".slime_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSlime+ChatColor.WHITE+" slimes");
                }if(config.contains("Players."+jugador.getUniqueId()+".wither_kills")){
                    int cantidadWither = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".wither_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadWither+ChatColor.WHITE+" withers");
                }if(config.contains("Players."+jugador.getUniqueId()+".blaze_kills")){
                    int cantidadBlaze = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".blaze_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadBlaze+ChatColor.WHITE+" blazes");
                }
                return true;
            }
        }
        return false;
    }
}
