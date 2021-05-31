
// $FF: renamed from: dg
public class class_187 extends class_181 {

    // $FF: renamed from: ff eu
   static HostData field_2269;
   // $FF: renamed from: v boolean
   final boolean field_2270;


    // $FF: renamed from: v (lv, lv, byte) int
   int method_3878(class_339 var1, class_339 var2, byte var3) {
      try {
         if(1396273817 * client.field_1413 == var1.field_3888 * 1693720149 && client.field_1413 * 1396273817 == var2.field_3888 * 1693720149) {
            if(var3 >= 7) {
               throw new IllegalStateException();
            } else {
               int var10000;
               if(this.field_2270) {
                  if(var3 >= 7) {
                     throw new IllegalStateException();
                  }

                  var10000 = var1.method_5999().method_6275(var2.method_5999(), -1175631567);
               } else {
                  var10000 = var2.method_5999().method_6275(var1.method_5999(), -1715928);
               }

               return var10000;
            }
         } else {
            return this.method_3830(var1, var2);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <init> (boolean) void
   public class_187(boolean var1) {
      super();
      try {
         this.field_2270 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    public int compare(Object var1, Object var2) {
      try {
         return this.method_3878((class_339)var1, (class_339)var2, (byte)-69);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

    // $FF: renamed from: w (int, cf, boolean, int) int
   static int method_3885(int var0, boolean var2, int var3) {
      try {
         String var15;
         if(3100 == var0) {
            if(var3 <= -460481447) {
               throw new IllegalStateException();
            } else {
               var15 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
               class_149.method_3135(0, "", var15);
               return 1;
            }
         } else if(var0 == 3101) {
            if(var3 <= -460481447) {
               throw new IllegalStateException();
            } else {
               class_136.field_1752 -= 2119512838;
               class_137.method_2969(class_164.field_2044, class_165.field_2052[class_136.field_1752 * -26460885], class_165.field_2052[1 + -26460885 * class_136.field_1752], (byte)78);
               return 1;
            }
         } else if(3103 == var0) {
            if(var3 <= -460481447) {
               throw new IllegalStateException();
            } else {
               if(!class_165.field_2062) {
                  if(var3 <= -460481447) {
                     throw new IllegalStateException();
                  }

                  class_165.field_2049 = true;
               }

               return 1;
            }
         } else {
            int var13;
            if(3104 == var0) {
               if(var3 <= -460481447) {
                  throw new IllegalStateException();
               } else {
                  var15 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                  var13 = 0;
                  if(class_52.method_575(var15)) {
                     if(var3 <= -460481447) {
                        throw new IllegalStateException();
                     }

                     var13 = class_168.method_3609(var15);
                  }

                  class_40 var17 = class_112.newPacket(ClientOpcode.OPCODE_10, client.field_1463.isaac, (byte)8);
                  var17.networkBuffer.writeIntReverse(var13);
                  client.field_1463.method_4079(var17);
                  return 1;
               }
            } else {
               class_40 var11;
               if(var0 == 3105) {
                  var15 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                  var11 = class_112.newPacket(ClientOpcode.OPCODE_23, client.field_1463.isaac, (byte)8);
                  var11.networkBuffer.writeByte(var15.length() + 1);
                  var11.networkBuffer.writeString(var15);
                  client.field_1463.method_4079(var11);
                  return 1;
               } else if(3106 == var0) {
                  if(var3 <= -460481447) {
                     throw new IllegalStateException();
                  } else {
                     var15 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                     var11 = class_112.newPacket(ClientOpcode.OPCODE_26, client.field_1463.isaac, (byte)8);
                     var11.networkBuffer.writeByte(var15.length() + 1);
                     var11.networkBuffer.writeString(var15);
                     client.field_1463.method_4079(var11);
                     return 1;
                  }
               } else {
                  String var5;
                  int var9;
                  if(var0 == 3107) {
                     if(var3 <= -460481447) {
                        throw new IllegalStateException();
                     } else {
                        var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                        var5 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                        class_98.method_1813(var9, var5, 325868949);
                        return 1;
                     }
                  } else if(var0 == 3108) {
                     if(var3 <= -460481447) {
                        throw new IllegalStateException();
                     } else {
                        class_136.field_1752 -= 1031785609;
                        var9 = class_165.field_2052[class_136.field_1752 * -26460885];
                        var13 = class_165.field_2052[1 + class_136.field_1752 * -26460885];
                        int var16 = class_165.field_2052[class_136.field_1752 * -26460885 + 2];
                        class_37 var18 = class_71.method_1047(var16);
                        class_84.method_1426(var18, var9, var13, (byte)8);
                        return 1;
                     }
                  } else if(var0 == 3109) {
                     if(var3 <= -460481447) {
                        throw new IllegalStateException();
                     } else {
                        class_136.field_1752 -= 2119512838;
                        var9 = class_165.field_2052[class_136.field_1752 * -26460885];
                        var13 = class_165.field_2052[1 + -26460885 * class_136.field_1752];
                        class_37 var22;
                        if(var2) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           }

                           var22 = class_124.field_1357;
                        } else {
                           var22 = class_165.field_2064;
                        }

                        class_37 var14 = var22;
                        class_84.method_1426(var14, var9, var13, (byte)8);
                        return 1;
                     }
                  } else {
                     boolean var19;
                     if(var0 == 3110) {
                        if(var3 <= -460481447) {
                           throw new IllegalStateException();
                        } else {
                           if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              }

                              var19 = true;
                           } else {
                              var19 = false;
                           }

                           client.field_1441 = var19;
                           return 1;
                        }
                     } else {
                        int[] var10000;
                        int var10001;
                        byte var10002;
                        if(3111 == var0) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              var10000 = class_165.field_2052;
                              var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                              if(class_87.preferences.roofsHidden) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = 1;
                              } else {
                                 var10002 = 0;
                              }

                              var10000[var10001] = var10002;
                              return 1;
                           }
                        } else if(3112 == var0) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              Preferences var21 = class_87.preferences;
                              boolean var20;
                              if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 var20 = true;
                              } else {
                                 var20 = false;
                              }

                              var21.roofsHidden = var20;
                              class_94.savePreferences(-996254306);
                              return 1;
                           }
                        } else if(var0 == 3113) {
                           var15 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                           if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              }

                              var19 = true;
                           } else {
                              var19 = false;
                           }

                           boolean var12 = var19;
                           class_195.method_3988(var15, var12, false, -892648524);
                           return 1;
                        } else if(3115 == var0) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                              var11 = class_112.newPacket(ClientOpcode.OPCODE_75, client.field_1463.isaac, (byte)8);
                              var11.networkBuffer.writeShortReverse(var9);
                              client.field_1463.method_4079(var11);
                              return 1;
                           }
                        } else if(var0 == 3116) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                              class_165.field_2054 -= -1000716630;
                              var5 = class_165.field_2053[1824375293 * class_165.field_2054];
                              String var6 = class_165.field_2053[1 + 1824375293 * class_165.field_2054];
                              if(var5.length() > 500) {
                                 return 1;
                              } else if(var6.length() > 500) {
                                 return 1;
                              } else {
                                 class_40 var7 = class_112.newPacket(ClientOpcode.OPCODE_79, client.field_1463.isaac, (byte)8);
                                 var7.networkBuffer.writeShortReverse(1 + class_166.method_3598(var5) + class_166.method_3598(var6));
                                 var7.networkBuffer.writeString(var5);
                                 var7.networkBuffer.writeString(var6);
                                 var7.networkBuffer.writeByte(var9);
                                 client.field_1463.method_4079(var7);
                                 return 1;
                              }
                           }
                        } else if(3117 == var0) {
                           if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              }

                              var19 = true;
                           } else {
                              var19 = false;
                           }

                           client.field_1563 = var19;
                           return 1;
                        } else if(3118 == var0) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 var19 = true;
                              } else {
                                 var19 = false;
                              }

                              client.mouseoverText = var19;
                              return 1;
                           }
                        } else if(var0 == 3119) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 var19 = true;
                              } else {
                                 var19 = false;
                              }

                              client.renderSelf = var19;
                              return 1;
                           }
                        } else if(var0 == 3120) {
                           if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                              client.field_1584 = -588333317 * (client.field_1584 * -1493328845 | 1);
                           } else {
                              client.field_1584 = -588333317 * (-1493328845 * client.field_1584 & -2);
                           }

                           return 1;
                        } else if(var0 == 3121) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 client.field_1584 = (-1493328845 * client.field_1584 | 2) * -588333317;
                              } else {
                                 client.field_1584 = (client.field_1584 * -1493328845 & -3) * -588333317;
                              }

                              return 1;
                           }
                        } else if(var0 == 3122) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 client.field_1584 = (client.field_1584 * -1493328845 | 4) * -588333317;
                              } else {
                                 client.field_1584 = -588333317 * (-1493328845 * client.field_1584 & -5);
                              }

                              return 1;
                           }
                        } else if(3123 == var0) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 client.field_1584 = -588333317 * (-1493328845 * client.field_1584 | 8);
                              } else {
                                 client.field_1584 = -588333317 * (client.field_1584 * -1493328845 & -9);
                              }

                              return 1;
                           }
                        } else if(3124 == var0) {
                           client.field_1584 = 0;
                           return 1;
                        } else if(var0 == 3125) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              client.field_1487 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1;
                              return 1;
                           }
                        } else if(var0 == 3126) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 var19 = true;
                              } else {
                                 var19 = false;
                              }

                              client.field_1589 = var19;
                              return 1;
                           }
                        } else if(3127 == var0) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 var19 = true;
                              } else {
                                 var19 = false;
                              }

                              class_204.method_4100(var19);
                              return 1;
                           }
                        } else if(3128 == var0) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              var10000 = class_165.field_2052;
                              var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                              if(class_123.method_2275()) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = 1;
                              } else {
                                 var10002 = 0;
                              }

                              var10000[var10001] = var10002;
                              return 1;
                           }
                        } else if(var0 == 3129) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              class_136.field_1752 -= 2119512838;
                              client.field_1497 = class_165.field_2052[-26460885 * class_136.field_1752] * 615844635;
                              client.field_1420 = class_165.field_2052[1 + -26460885 * class_136.field_1752] * 988767649;
                              return 1;
                           }
                        } else if(var0 == 3130) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              class_136.field_1752 -= 2119512838;
                              return 1;
                           }
                        } else if(3131 == var0) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              class_136.field_1752 -= -1087727229;
                              return 1;
                           }
                        } else if(3132 == var0) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_137.field_1766 * 646214551;
                              class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -1538307343 * class_58.field_460;
                              return 1;
                           }
                        } else if(var0 == 3133) {
                           class_136.field_1752 -= -1087727229;
                           return 1;
                        } else if(3134 == var0) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              return 1;
                           }
                        } else if(var0 == 3135) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              class_136.field_1752 -= 2119512838;
                              return 1;
                           }
                        } else if(var0 == 3136) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              client.field_1579 = -133390871;
                              client.field_1581 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * 1500303483;
                              return 1;
                           }
                        } else if(var0 == 3137) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              client.field_1579 = 1342728518;
                              client.field_1581 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * 1500303483;
                              return 1;
                           }
                        } else if(var0 == 3138) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              client.field_1579 = 0;
                              return 1;
                           }
                        } else if(3139 == var0) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              client.field_1579 = -1476119389;
                              return 1;
                           }
                        } else if(3140 == var0) {
                           if(var3 <= -460481447) {
                              throw new IllegalStateException();
                           } else {
                              client.field_1579 = -133390871;
                              if(var2) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 var10001 = class_124.field_1357.field_101 * -1722455647;
                              } else {
                                 var10001 = -1722455647 * class_165.field_2064.field_101;
                              }

                              client.field_1581 = 1500303483 * var10001;
                              return 1;
                           }
                        } else {
                           boolean var10;
                           if(3141 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                    if(var3 <= -460481447) {
                                       throw new IllegalStateException();
                                    }

                                    var19 = true;
                                 } else {
                                    var19 = false;
                                 }

                                 var10 = var19;
                                 class_87.preferences.field_2123 = var10;
                                 class_94.savePreferences(-511329856);
                                 return 1;
                              }
                           } else if(3142 == var0) {
                              var10000 = class_165.field_2052;
                              var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                              if(class_87.preferences.field_2123) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = 1;
                              } else {
                                 var10002 = 0;
                              }

                              var10000[var10001] = var10002;
                              return 1;
                           } else if(var0 == 3143) {
                              if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 var19 = true;
                              } else {
                                 var19 = false;
                              }

                              var10 = var19;
                              client.rememberEmail = var10;
                              if(!var10) {
                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }

                                 class_87.preferences.rememberedEmail = "";
                                 class_94.savePreferences(-320160331);
                              }

                              return 1;
                           } else if(var0 == 3144) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.rememberEmail ?1:0;
                                 return 1;
                              }
                           } else if(3145 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 return 1;
                              }
                           } else if(var0 == 3146) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                    if(var3 <= -460481447) {
                                       throw new IllegalStateException();
                                    }

                                    var19 = true;
                                 } else {
                                    var19 = false;
                                 }

                                 var10 = var19;
                                 if(class_87.preferences.musicEnabled == var10) {
                                    if(var3 <= -460481447) {
                                       throw new IllegalStateException();
                                    }

                                    class_87.preferences.musicEnabled = !var10;
                                    class_94.savePreferences(-1368111062);
                                 }

                                 return 1;
                              }
                           } else if(var0 == 3147) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 var10000 = class_165.field_2052;
                                 var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                                 if(class_87.preferences.musicEnabled) {
                                    if(var3 <= -460481447) {
                                       throw new IllegalStateException();
                                    }

                                    var10002 = 0;
                                 } else {
                                    var10002 = 1;
                                 }

                                 var10000[var10001] = var10002;
                                 return 1;
                              }
                           } else if(3148 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 return 1;
                              }
                           } else if(var0 == 3149) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(3150 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(var0 == 3151) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(var0 == 3152) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(3153 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -564105319 * class_177.field_2190;
                                 return 1;
                              }
                           } else if(var0 == 3154) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_135.method_2949(1248092260);
                                 return 1;
                              }
                           } else if(3155 == var0) {
                              class_165.field_2054 -= 1647125333;
                              return 1;
                           } else if(var0 == 3156) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 return 1;
                              }
                           } else if(3157 == var0) {
                              class_136.field_1752 -= 2119512838;
                              return 1;
                           } else if(3158 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(3159 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(var0 == 3160) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(var0 == 3161) {
                              class_136.field_1752 -= -1087727229;
                              class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                              return 1;
                           } else if(var0 == 3162) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_136.field_1752 -= -1087727229;
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(3163 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2054 -= 1647125333;
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(3164 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_136.field_1752 -= -1087727229;
                                 class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                                 return 1;
                              }
                           } else if(3165 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_136.field_1752 -= -1087727229;
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(3166 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_136.field_1752 -= 2119512838;
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(3167 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_136.field_1752 -= 2119512838;
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(3168 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_136.field_1752 -= 2119512838;
                                 class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                                 class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                                 class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                                 class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                                 class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                                 class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                                 class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                                 class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                                 class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                                 return 1;
                              }
                           } else if(var0 == 3169) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 return 1;
                              }
                           } else if(3170 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(3171 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(var0 == 3172) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_136.field_1752 -= -1087727229;
                                 return 1;
                              }
                           } else if(3173 == var0) {
                              class_136.field_1752 -= -1087727229;
                              class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                              return 1;
                           } else if(3174 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_136.field_1752 -= -1087727229;
                                 return 1;
                              }
                           } else if(3175 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                                 return 1;
                              }
                           } else if(var0 == 3176) {
                              return 1;
                           } else if(var0 == 3177) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 return 1;
                              }
                           } else if(var0 == 3178) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2054 -= 1647125333;
                                 return 1;
                              }
                           } else if(3179 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 return 1;
                              }
                           } else if(3180 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 class_165.field_2054 -= 1647125333;
                                 return 1;
                              }
                           } else if(3181 == var0) {
                              if(var3 <= -460481447) {
                                 throw new IllegalStateException();
                              } else {
                                 var9 = 100 - Math.min(Math.max(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885], 0), 100);
                                 class_48.method_550((double)(0.5F + (float)var9 / 200.0F));
                                 return 1;
                              }
                           } else if(3182 == var0) {
                              float var4 = 200.0F * ((float)class_87.preferences.field_2128 - 0.5F);
                              class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 100 - Math.round(var4);
                              return 1;
                           } else {
                              if(var0 != 3183) {
                                 if(var0 != 3184) {
                                    return 2;
                                 }

                                 if(var3 <= -460481447) {
                                    throw new IllegalStateException();
                                 }
                              }

                              class_136.field_1752 -= -1087727229;
                              return 1;
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: am (int, int) int
   static int method_3886(int var0) {
      try {
         return (int)((Math.log((double)var0) / class_165.field_2065 - 7.0D) * 256.0D);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
