import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

import javax.sound.sampled.AudioSystem;

public class Main {

    public static void main(String[] args) {
        /*
         * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
         * методы. Реализовать в java.
         * Создать множество ноутбуков.
         * Написать метод, который будет запрашивать у пользователя критерий (или
         * критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии
         * фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую
         * необходимому критерию:
         * 1 - ОЗУ
         * 2 - Объем ЖД
         * 3 - Операционная система
         * 4 - Цвет …
         * Далее нужно запросить минимальные значения для указанных критериев -
         * сохранить параметры фильтрации можно также в Map.
         * Отфильтровать ноутбуки из первоначального множества и вывести проходящие по
         * условиям.
         * 
         * Работу сдать как обычно ссылкой на гит репозиторий
         * 
         * P.S. Частые ошибки смотри в конце семинара
         */

        NoutBooksList nList = new NoutBooksList();
        Menu menu = new Menu();
        menu.menu();
        // int count = 0;

        for (NoutBook n : nList.noutList()) {
            // while (count < 1) {
            for (var k : menu.chekMap.entrySet()) {

                if (k.getValue().toString().equals(n.getmodelName().toString())) {
                    for (var l : menu.chekMap.entrySet()) {
                        if (l.getValue().equals(Integer.toString(n.getRam()))) {
                            for (var m : menu.chekMap.entrySet()) {
                                if (m.getValue().equals(Integer.toString(n.getHhd()))) {
                                    for (var r : menu.chekMap.entrySet()) {
                                        if (r.getValue().toString().equals(n.getOs().toString())) {
                                            for (var z : menu.chekMap.entrySet()) {
                                                if (z.getValue().toString().equals(n.getColor().toString())) {
                                                    System.out.println(n.prinTo());
                                                } else
                                                    System.out.println(n.prinTo());

                                            }
                                        }
                                        if (r.getValue().toString().equals(n.getColor().toString())) {
                                            System.out.println(n.prinTo());
                                        } else {
                                            System.out.println(n.prinTo());

                                        }
                                    }
                                }
                                if (m.getValue().toString().equals(n.getOs().toString())) {
                                    for (var z : menu.chekMap.entrySet()) {
                                        if (z.getValue().toString().equals(n.getColor().toString())) {
                                            System.out.println(n.prinTo());
                                        } else {
                                            System.out.println(n.prinTo());

                                        }
                                    }
                                }
                                if (m.getValue().toString().equals(n.getColor().toString())) {
                                    System.out.println(n.prinTo());
                                } else {
                                    System.out.println(n.prinTo());

                                }
                            }
                        }
                        if (l.getValue().equals(Integer.toString(n.getHhd()))) {
                            for (var r : menu.chekMap.entrySet()) {
                                if (r.getValue().toString().equals(n.getOs().toString())) {
                                    for (var z : menu.chekMap.entrySet()) {
                                        if (z.getValue().toString().equals(n.getColor().toString())) {
                                            System.out.println(n.prinTo());
                                        } else {
                                            System.out.println(n.prinTo());

                                        }
                                    }
                                }
                                if (r.getValue().toString().equals(n.getColor().toString())) {
                                    System.out.println(n.prinTo());
                                } else
                                    System.out.println(n.prinTo());

                            }
                        }
                        if (l.getValue().toString().equals(n.getOs().toString())) {
                            for (var z : menu.chekMap.entrySet()) {
                                if (z.getValue().toString().equals(n.getColor().toString())) {
                                    System.out.println(n.prinTo());
                                } else
                                    System.out.println(n.prinTo());

                            }
                        }
                        if (l.getValue().toString().equals(n.getColor().toString())) {
                            System.out.println(n.prinTo());
                        } else
                            System.out.println(n.prinTo());

                    }
                }
                if (k.getValue().equals(Integer.toString(n.getRam()))) {
                    for (var m : menu.chekMap.entrySet()) {
                        if (m.getValue().equals(Integer.toString(n.getHhd()))) {
                            for (var r : menu.chekMap.entrySet()) {
                                if (r.getValue().toString().equals(n.getOs().toString())) {
                                    for (var z : menu.chekMap.entrySet()) {
                                        if (z.getValue().toString().equals(n.getColor().toString())) {
                                            System.out.println(n.prinTo());
                                        } else
                                            System.out.println(n.prinTo());

                                    }
                                }
                            }
                        }
                        if (m.getValue().toString().equals(n.getOs().toString())) {
                            for (var z : menu.chekMap.entrySet()) {
                                if (z.getValue().toString().equals(n.getColor().toString())) {
                                    System.out.println(n.prinTo());
                                } else
                                    System.out.println(n.prinTo());

                            }
                        }
                        if (m.getValue().toString().equals(n.getColor().toString())) {
                            System.out.println(n.prinTo());
                        } else
                            System.out.println(n.prinTo());

                    }
                }
                if (k.getValue().equals(Integer.toString(n.getHhd()))) {
                    for (var r : menu.chekMap.entrySet()) {
                        if (r.getValue().toString().equals(n.getOs().toString())) {
                            for (var z : menu.chekMap.entrySet()) {
                                if (z.getValue().toString().equals(n.getColor().toString())) {
                                    System.out.println(n.prinTo());
                                } else
                                    System.out.println(n.prinTo());

                            }
                        }
                        if (r.getValue().toString().equals(n.getColor().toString())) {
                            System.out.println(n.prinTo());
                        } else
                            System.out.println(n.prinTo());

                    }
                }
                if (k.getValue().toString().equals(n.getOs().toString())) {
                    for (var z : menu.chekMap.entrySet()) {
                        if (z.getValue().toString().equals(n.getColor().toString())) {
                            System.out.println(n.prinTo());
                        } else
                            System.out.println(n.prinTo());

                    }
                }
                if (k.getValue().toString().equals(n.getColor().toString())) {
                    System.out.println(n.prinTo());
                }
            }
            // count++;
            // }

        }
    }
}