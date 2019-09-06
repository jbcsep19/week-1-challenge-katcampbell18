import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String Go, Follow, Walk, Cross, Move, Glow, Stroll, Plod, Stride, Open, Take, Climb, Swing, Up, Jump;

        System.out.println(" WELCOME TO THE TREASURE HUNT!!!");
        System.out.println("  ");
        System.out.println(" Legend has it that over 400 years ago the fearsome pirate Smith hid his treasure on an island somewhere in the Pacific.  After many years of searching, you have found the mysterious island and, hopefully, Smith's treasure.  Your goal is to find that treasure, but BEWARE!!!! There are dangerous obstacles that you will have to navigate to obtain your wealth. Are you brave enough?  ");
        System.out.println("   ");
        System.out.println(" You are standing on the beach.  There are five paths leading into the jungle.  Which one do you take 'path1', 'path2', 'path3', 'path4', or 'path5'? ");
        System.out.print("> ");
        Go = keyboard.next();

        if (Go.equalsIgnoreCase("path1")) {
            System.out.println("You come to a fork in the trail. One side leads to running water and the other side leads deeper into the jungle.  Do you go to the 'water' or follow the 'trail'? ");
            System.out.print(">  ");
            Follow = keyboard.next();

            if (Follow.equalsIgnoreCase("water")) {
                System.out.println("You come to a river.  There is an old rope bridge to cross to the other side. Would you like to cross the bridge, 'Yes' or 'No'?");
                System.out.print(">  ");
                Cross = keyboard.next();

                if (Cross.equalsIgnoreCase("Yes")) {
                    System.out.println("  ");
                    System.out.println("The bridge collapsed and you were eaten by crocodiles.");
                } else if (Cross.equalsIgnoreCase("No")) {
                    System.out.println("  ");
                    System.out.println("You call yourself an adventurer! Go back home!");
                }
            } else if (Follow.equalsIgnoreCase("trail")) {
                System.out.println("You hear footsteps coming toward you. Do you want to 'fight', or 'run'?");
                System.out.print(">  ");
                Walk = keyboard.next();

                if (Walk.equalsIgnoreCase("fight")) {
                    System.out.println("  ");
                    System.out.println("There were too many cannibals to fight. You made a tasty snack.");
                } else if (Walk.equalsIgnoreCase("run")) {
                    System.out.println("  ");
                    System.out.println("You were caught by cannibals and eaten for dinner.");
                }
            }
        }

        if (Go.equalsIgnoreCase("path2")) {
            System.out.println("You come to a fork in the trail. One side has a stack of boulders and the other side leads deeper into the jungle.  Do you go to the 'rocks' or follow the 'trail'? ");
            System.out.print(">  ");
            Follow = keyboard.next();

            if (Follow.equalsIgnoreCase("rocks")) {
                System.out.println("There is a log to help you move the rocks . Would you like to use it, 'Yes' or 'No'?");
                System.out.print(">  ");
                Move = keyboard.next();

                if (Move.equalsIgnoreCase("Yes")) {
                    System.out.println("  ");
                    System.out.println("The log was really a poisonous snake.  Now you are dead.");
                } else if (Move.equalsIgnoreCase("No")) {
                    System.out.println("  ");
                    System.out.println("You call yourself an adventurer! Go back home!");
                }
            } else if (Follow.equalsIgnoreCase("trail")) {
                System.out.println("You hear footsteps coming toward you. Do you want to 'fight', or 'run'?");
                System.out.print(">  ");
                Stroll = keyboard.next();

                if (Stroll.equalsIgnoreCase("fight")) {
                    System.out.println("  ");
                    System.out.println("There were too many cannibals to fight. You made a tasty snack.");
                } else if (Stroll.equalsIgnoreCase("run")) {
                    System.out.println("  ");
                    System.out.println("You were caught by cannibals and eaten for dinner.");
                }
            }
        }

        if (Go.equalsIgnoreCase("path3")) {
            System.out.println("You come to a fork in the trail. One side leads to a cave and the other side leads deeper into the jungle.  Do you go to the 'cave' or follow the 'trail'? ");
            System.out.print(">  ");
            Follow = keyboard.next();

            if (Follow.equalsIgnoreCase("cave")) {
                System.out.println("You come to a cave.  There is an lamp on the side. Would you like to use the lamp, 'Yes' or 'No'?");
                System.out.print(">  ");
                Glow = keyboard.next();

                if (Glow.equalsIgnoreCase("Yes")) {
                    System.out.println("  ");
                    System.out.println("The cave was filled with venomous spiders.  You are dead.");
                } else if (Glow.equalsIgnoreCase("No")) {
                    System.out.println("  ");
                    System.out.println("You didn't see the wild boar hiding inside.  Now your dead.");
                }
            } else if (Follow.equalsIgnoreCase("trail")) {
                System.out.println("You hear footsteps coming toward you. Do you want to 'fight', or 'run'?");
                System.out.print(">  ");
                Plod = keyboard.next();

                if (Plod.equalsIgnoreCase("fight")) {
                    System.out.println("  ");
                    System.out.println("There were too many cannibals to fight. You made a tasty snack.");
                } else if (Plod.equalsIgnoreCase("run")) {
                    System.out.println("  ");
                    System.out.println("You were caught by cannibals and eaten for dinner.");
                }
            }
        }

        if (Go.equalsIgnoreCase("path4")) {
            System.out.println("You come to a fork in the trail. One side leads to a clearing and the other side leads deeper into the jungle.  Do you go to the 'clearing' or follow the 'trail'? ");
            System.out.print(">  ");
            Follow = keyboard.next();

            if (Follow.equalsIgnoreCase("clearing")) {
                System.out.println("You come to a field.  There is an old hut on the other side. Would you like to go the hut, 'Yes' or 'No'?");
                System.out.print(">  ");
                Stride = keyboard.next();

                if (Stride.equalsIgnoreCase("Yes")) {
                    System.out.println("There is a chest in the hut.  Would you like to open it, 'Yes' or 'No'?");
                    System.out.println(">  ");
                    Open = keyboard.next();

                    if (Open.equalsIgnoreCase("Yes")) {
                        System.out.println("You see a shovel and an ax in the chest.  Do you want to take the 'shovel or the 'ax'?");
                        System.out.println(">  ");
                        Take = keyboard.next();

                        if (Take.equalsIgnoreCase("shovel")) {
                            System.out.println("  ");
                            System.out.println("Use the shovel to dig a hole on behind the hut.  You have found the treasure!!!!!");
                        } else if (Take.equalsIgnoreCase("ax")) {
                            System.out.println("  ");
                            System.out.println("It takes too long to dig a hole with an ax.  You are ambushed by the cannibals.");
                        }
                    } else if (Open.equalsIgnoreCase("No")) {
                        System.out.println("  ");
                        System.out.println(" How do you know if there's treasure inside?");
                    }
                } else if (Stride.equalsIgnoreCase("No")) {
                        System.out.println("  ");
                        System.out.println("You call yourself an adventurer! Go back home!");

                }
            } else if (Follow.equalsIgnoreCase("trail")) {
                    System.out.println("You hear crashing noises coming toward you.  Do you want to climb a tree to evade the intruders, 'Yes' or 'No'?");
                    System.out.print(">  ");
                    Climb = keyboard.next();

                    if (Climb.equalsIgnoreCase("Yes")) {
                        System.out.println("You climb to a high branch to avoid being prey. You see a vine. Do you use the vine to swing to the other tree, 'Yes' or 'No'?");
                        System.out.println(">  ");
                        Swing = keyboard.next();

                        if (Swing.equalsIgnoreCase("Yes")) {
                            System.out.println("  ");
                            System.out.println("The vine breaks and you fall to your death.");

                        } else if (Swing.equalsIgnoreCase("No")) {
                            System.out.println("  ");
                            System.out.println("You fell asleep and became a python's dinner.");
                        }

                    } else if (Climb.equalsIgnoreCase("No")) {
                            System.out.println("You run and come to a pit.  Do you want to jump over the pit, 'Yes' or 'No'?");
                            System.out.println(">  ");
                            Jump = keyboard.next();

                            if (Jump.equalsIgnoreCase("Yes")) {
                                System.out.println("  ");
                                System.out.println("You don't jump far enough and land in the spike-filled pit.");

                            } else if (Jump.equalsIgnoreCase("No")) {
                                System.out.println("  ");
                                System.out.println("You are frightened by a deer and fall into the spike-filled pit anyway.");
                            }
                        }
                    }
                }

                if (Go.equalsIgnoreCase("path5")) {
                    System.out.println("You come to a fork in the trail. Do you go to the 'left' or the 'right'? ");
                    System.out.print(">  ");
                    Follow = keyboard.next();

                    if (Follow.equalsIgnoreCase("left")) {
                        System.out.println("you have to climb a cliff to get to the next plateau . Would you like to climb it, 'Yes' or 'No'?");
                        System.out.print(">  ");
                        Up = keyboard.next();

                        if (Up.equalsIgnoreCase("Yes")) {
                            System.out.println("  ");
                            System.out.println("Your rope broke before you go to the top.  You're dead.");
                        } else if (Up.equalsIgnoreCase("No")) {
                            System.out.println("  ");
                            System.out.println("You call yourself an adventurer! Go back home!");
                        }
                    } else if (Follow.equalsIgnoreCase("right")) {
                        System.out.println("You find a small village that appears to be empty. You see food and water.  Do you want take a break 'Yes', or 'No'?");
                        System.out.print(">  ");
                        Stroll = keyboard.next();

                        if (Stroll.equalsIgnoreCase("Yes")) {
                            System.out.println("  ");
                            System.out.println("You ate too much and fell asleep.  The cannibals make a feast of you.");
                        } else if (Stroll.equalsIgnoreCase("No")) {
                            System.out.println("  ");
                            System.out.println("You become weak and eventually die.");

                        }
                    }

                }
            }
        }

