
// $FF: renamed from: ep
public class class_81 extends class_59 {

   // $FF: renamed from: v jv
   static class_306 field_754;
   // $FF: renamed from: f int
   public int field_755;
   // $FF: renamed from: n hz
   static class_272 field_756;


   // $FF: renamed from: f (nd, int) void
   void method_1340(class_28 var1) {
      try {
         while(true) {
            int var3 = var1.method_130();
            if(0 == var3) {
               return;
            }

            this.method_1341(var1, var3, -1191086190);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: y (nd, int, int) void
   void method_1341(class_28 var1, int var2, int var3) {
      try {
         if(var2 == 2) {
            if(var3 <= -1494268527) {
               throw new IllegalStateException();
            }

            this.field_755 = var1.method_132() * 996763343;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_756 = var10000;
   }

   // $FF: renamed from: v (jv, int, int) in
   static class_38 method_1347(class_306 var0, int var1, int var2) {
      try {
         byte[] var3 = var0.method_5388(var1, (byte)-110);
         if(var3 == null) {
            if(var2 != -1662391635) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_38 var10000 = new class_38(var3);
            return var10000;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <init> () void
   class_81() {
      super();
      try {
         this.field_755 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: jo (io, int) boolean
   static final boolean method_1355(class_37 var0, int var1) {
      try {
         if(var0.field_170 == null) {
            if(var1 >= -870661127) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            for(int var2 = 0; var2 < var0.field_170.length; ++var2) {
               if(var1 >= -870661127) {
                  throw new IllegalStateException();
               }

               int var3 = class_325.method_5780(var0, var2, 411912150);
               int var4 = var0.field_193[var2];
               if(var0.field_170[var2] == 2) {
                  if(var3 >= var4) {
                     if(var1 >= -870661127) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               } else if(3 == var0.field_170[var2]) {
                  if(var1 >= -870661127) {
                     throw new IllegalStateException();
                  }

                  if(var3 <= var4) {
                     if(var1 >= -870661127) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               } else if(4 == var0.field_170[var2]) {
                  if(var1 >= -870661127) {
                     throw new IllegalStateException();
                  }

                  if(var4 == var3) {
                     return false;
                  }
               } else if(var3 != var4) {
                  if(var1 >= -870661127) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: j (int, cf, boolean, int) int
   static int method_1357(int var0, boolean var2, int var3) {
      try {
         int var5 = -1;
         class_37 var4;
         if(var0 >= 2000) {
            if(var3 >= 1918179577) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var5 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
            var4 = class_71.method_1047(var5);
         } else {
            class_37 var10000;
            if(var2) {
               if(var3 >= 1918179577) {
                  throw new IllegalStateException();
               }

               var10000 = class_124.field_1357;
            } else {
               var10000 = class_165.field_2064;
            }

            var4 = var10000;
         }

         if(1100 == var0) {
            if(var3 >= 1918179577) {
               throw new IllegalStateException();
            } else {
               class_136.field_1752 -= 2119512838;
               var4.field_122 = class_165.field_2052[class_136.field_1752 * -26460885] * 332728613;
               if(var4.field_122 * -1662391635 > 1489642403 * var4.field_219 - var4.field_104 * 1163271639) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  }

                  var4.field_122 = -1340677745 * var4.field_219 - var4.field_104 * -715006189;
               }

               if(-1662391635 * var4.field_122 < 0) {
                  var4.field_122 = 0;
               }

               var4.field_123 = class_165.field_2052[class_136.field_1752 * -26460885 + 1] * -174176415;
               if(var4.field_123 * 1974901921 > 1577090123 * var4.field_125 - -571887853 * var4.field_117) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  }

                  var4.field_123 = 1039263083 * var4.field_125 - var4.field_117 * 567515955;
               }

               if(1974901921 * var4.field_123 < 0) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  }

                  var4.field_123 = 0;
               }

               class_254.method_4900(var4, (byte)109);
               return 1;
            }
         } else if(var0 == 1101) {
            if(var3 >= 1918179577) {
               throw new IllegalStateException();
            } else {
               var4.field_245 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * 1950267181;
               class_254.method_4900(var4, (byte)79);
               return 1;
            }
         } else {
            boolean var10001;
            if(1102 == var0) {
               if(var3 >= 1918179577) {
                  throw new IllegalStateException();
               } else {
                  if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                     if(var3 >= 1918179577) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var4.field_130 = var10001;
                  class_254.method_4900(var4, (byte)55);
                  return 1;
               }
            } else if(var0 == 1103) {
               var4.field_132 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * -1652964871;
               class_254.method_4900(var4, (byte)14);
               return 1;
            } else if(var0 == 1104) {
               if(var3 >= 1918179577) {
                  throw new IllegalStateException();
               } else {
                  var4.field_162 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * -1787750353;
                  class_254.method_4900(var4, (byte)120);
                  return 1;
               }
            } else if(var0 == 1105) {
               if(var3 >= 1918179577) {
                  throw new IllegalStateException();
               } else {
                  var4.field_179 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * -879658487;
                  class_254.method_4900(var4, (byte)98);
                  return 1;
               }
            } else if(var0 == 1106) {
               if(var3 >= 1918179577) {
                  throw new IllegalStateException();
               } else {
                  var4.field_138 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * 1628098669;
                  class_254.method_4900(var4, (byte)114);
                  return 1;
               }
            } else if(var0 == 1107) {
               if(var3 >= 1918179577) {
                  throw new IllegalStateException();
               } else {
                  if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                     if(var3 >= 1918179577) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var4.field_139 = var10001;
                  class_254.method_4900(var4, (byte)106);
                  return 1;
               }
            } else if(1108 == var0) {
               var4.field_144 = 185258491;
               var4.field_145 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * -252507035;
               class_254.method_4900(var4, (byte)15);
               return 1;
            } else if(var0 == 1109) {
               class_136.field_1752 -= 2063571218;
               var4.field_150 = class_165.field_2052[-26460885 * class_136.field_1752] * -45737611;
               var4.field_151 = class_165.field_2052[class_136.field_1752 * -26460885 + 1] * 1702837895;
               var4.field_142 = 626567735 * class_165.field_2052[2 + -26460885 * class_136.field_1752];
               var4.field_153 = class_165.field_2052[-26460885 * class_136.field_1752 + 3] * -1507467001;
               var4.field_137 = class_165.field_2052[class_136.field_1752 * -26460885 + 4] * -1540047291;
               var4.field_205 = class_165.field_2052[5 + class_136.field_1752 * -26460885] * -922077133;
               class_254.method_4900(var4, (byte)38);
               return 1;
            } else {
               int var9;
               if(var0 == 1110) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  } else {
                     var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                     if(var4.field_148 * 679546321 != var9) {
                        if(var3 >= 1918179577) {
                           throw new IllegalStateException();
                        }

                        var4.field_148 = var9 * 161901361;
                        var4.field_116 = 0;
                        var4.field_232 = 0;
                        class_254.method_4900(var4, (byte)8);
                     }

                     return 1;
                  }
               } else if(1111 == var0) {
                  var4.field_88 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1;
                  class_254.method_4900(var4, (byte)105);
                  return 1;
               } else if(var0 == 1112) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  } else {
                     String var10 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                     if(!var10.equals(var4.field_136)) {
                        if(var3 >= 1918179577) {
                           throw new IllegalStateException();
                        }

                        var4.field_136 = var10;
                        class_254.method_4900(var4, (byte)96);
                     }

                     return 1;
                  }
               } else if(var0 == 1113) {
                  var4.field_105 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * 1876449919;
                  class_254.method_4900(var4, (byte)41);
                  return 1;
               } else if(var0 == 1114) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  } else {
                     class_136.field_1752 -= 1031785609;
                     var4.field_223 = class_165.field_2052[class_136.field_1752 * -26460885] * -638965261;
                     var4.field_118 = -1627873095 * class_165.field_2052[1 + -26460885 * class_136.field_1752];
                     var4.field_180 = class_165.field_2052[2 + -26460885 * class_136.field_1752] * 635838977;
                     class_254.method_4900(var4, (byte)45);
                     return 1;
                  }
               } else if(1115 == var0) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  } else {
                     if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                        if(var3 >= 1918179577) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     var4.field_167 = var10001;
                     class_254.method_4900(var4, (byte)20);
                     return 1;
                  }
               } else if(1116 == var0) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  } else {
                     var4.field_140 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * -1255822637;
                     class_254.method_4900(var4, (byte)24);
                     return 1;
                  }
               } else if(1117 == var0) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  } else {
                     var4.field_141 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * -1005772953;
                     class_254.method_4900(var4, (byte)48);
                     return 1;
                  }
               } else if(var0 == 1118) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  } else {
                     if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                        if(var3 >= 1918179577) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     var4.field_185 = var10001;
                     class_254.method_4900(var4, (byte)9);
                     return 1;
                  }
               } else if(var0 == 1119) {
                  if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                     if(var3 >= 1918179577) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var4.field_173 = var10001;
                  class_254.method_4900(var4, (byte)32);
                  return 1;
               } else if(var0 == 1120) {
                  class_136.field_1752 -= 2119512838;
                  var4.field_219 = class_165.field_2052[class_136.field_1752 * -26460885] * 1932863499;
                  var4.field_125 = class_165.field_2052[1 + class_136.field_1752 * -26460885] * -1137939101;
                  class_254.method_4900(var4, (byte)115);
                  if(-1 != var5) {
                     if(var3 >= 1918179577) {
                        throw new IllegalStateException();
                     }

                     if(0 == var4.field_103 * 1659206769) {
                        if(var3 >= 1918179577) {
                           throw new IllegalStateException();
                        }

                        class_352.method_6231(class_37.field_93[var5 >> 16], var4, false);
                     }
                  }

                  return 1;
               } else if(1121 == var0) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  } else {
                     class_115.method_2243(-1722455647 * var4.field_101, 41180389 * var4.field_102);
                     client.field_1583 = var4;
                     class_254.method_4900(var4, (byte)106);
                     return 1;
                  }
               } else if(var0 == 1122) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  } else {
                     var4.field_236 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * 1725494073;
                     class_254.method_4900(var4, (byte)71);
                     return 1;
                  }
               } else if(1123 == var0) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  } else {
                     var4.field_127 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * -318428731;
                     class_254.method_4900(var4, (byte)79);
                     return 1;
                  }
               } else if(1124 == var0) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  } else {
                     var4.field_154 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * 1423847895;
                     class_254.method_4900(var4, (byte)58);
                     return 1;
                  }
               } else if(1125 == var0) {
                  if(var3 >= 1918179577) {
                     throw new IllegalStateException();
                  } else {
                     var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                     class_399 var7 = (class_399)class_197.method_4016(class_243.method_4687(), var9, -611336247);
                     if(null != var7) {
                        if(var3 >= 1918179577) {
                           throw new IllegalStateException();
                        }

                        var4.field_131 = var7;
                        class_254.method_4900(var4, (byte)114);
                     }

                     return 1;
                  }
               } else {
                  boolean var6;
                  boolean var11;
                  if(var0 == 1126) {
                     if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                        if(var3 >= 1918179577) {
                           throw new IllegalStateException();
                        }

                        var11 = true;
                     } else {
                        var11 = false;
                     }

                     var6 = var11;
                     var4.field_135 = var6;
                     return 1;
                  } else if(var0 == 1127) {
                     if(var3 >= 1918179577) {
                        throw new IllegalStateException();
                     } else {
                        if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                           if(var3 >= 1918179577) {
                              throw new IllegalStateException();
                           }

                           var11 = true;
                        } else {
                           var11 = false;
                        }

                        var6 = var11;
                        var4.field_248 = var6;
                        return 1;
                     }
                  } else if(var0 == 1128) {
                     if(var3 >= 1918179577) {
                        throw new IllegalStateException();
                     } else {
                        class_136.field_1752 -= 2119512838;
                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }
}
