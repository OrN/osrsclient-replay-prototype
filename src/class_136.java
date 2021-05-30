import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

// $FF: renamed from: aq
public class class_136 {

   // $FF: renamed from: n java.lang.String
   public static String field_1751;
   // $FF: renamed from: u int
   static int field_1752;
   // $FF: renamed from: f int
   static final int field_1753 = 0;
   // $FF: renamed from: w int
   static final int field_1754 = 19136899;
   // $FF: renamed from: v java.applet.Applet
   public static Applet field_1755;
   // $FF: renamed from: bd int
   static final int field_1756 = 1001;
   // $FF: renamed from: y int
   static final int field_1757 = 1;
   // $FF: renamed from: ql int
   static final int field_1758 = 24624;
   // $FF: renamed from: j int
   static final int field_1759 = 50;


   // $FF: renamed from: <init> () void
   class_136() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "aq.<init>(" + ')');
      }
   }

   // $FF: renamed from: n (int, int, int) void
   static void method_2953(int var0, int var1, int var2) {
      try {
         int[] var3 = new int[4];
         int[] var4 = new int[4];
         var3[0] = var0;
         var4[0] = var1;
         int var5 = 1;

         for(int var6 = 0; var6 < 4; ++var6) {
            if(var2 == 2103304901) {
               return;
            }

            if(class_149.field_1884[var6] != var0) {
               if(var2 == 2103304901) {
                  throw new IllegalStateException();
               }

               var3[var5] = class_149.field_1884[var6];
               var4[var5] = class_149.field_1883[var6];
               ++var5;
            }
         }

         class_149.field_1884 = var3;
         class_149.field_1883 = var4;
         class_157.method_3300(class_166.field_2083, 0, class_166.field_2083.length - 1, class_149.field_1884, class_149.field_1883, -408447852);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "aq.n(" + ')');
      }
   }

   // $FF: renamed from: y (java.lang.String, boolean, boolean) void
   public static void method_2954(String var0, boolean var1, boolean var2) {
      if(var1) {
         if(!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var4) {
               ;
            }
         }

         if(field_1751.startsWith("win") && !var2) {
            class_283.method_5183(var0, 0, (byte)0);
         } else if(field_1751.startsWith("mac")) {
            class_90.method_1602(var0, 1, "openjs", -337365207);
         } else {
            class_283.method_5183(var0, 2, (byte)0);
         }
      } else {
         class_283.method_5183(var0, 3, (byte)0);
      }

   }

   // $FF: renamed from: b (java.lang.String, int, java.lang.String) boolean
   static boolean method_2955(String var0, int var1, String var2) {
      if(var1 == 0) {
         try {
            if(!field_1751.startsWith("win")) {
               throw new Exception();
            } else if(!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if(var10.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if(var1 == 1) {
         try {
            Object var3 = class_129.method_2854(field_1755, var2, new Object[]{(new URL(field_1755.getCodeBase(), var0)).toString()}, (short)-25906);
            return var3 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if(2 == var1) {
         try {
            field_1755.getAppletContext().showDocument(new URL(field_1755.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if(3 == var1) {
         try {
            class_129.method_2853(field_1755, "loggedout", 901657187);
         } catch (Throwable var9) {
            ;
         }

         try {
            field_1755.getAppletContext().showDocument(new URL(field_1755.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: j (java.lang.String, int) boolean
   static boolean method_2956(String var0, int var1) {
      return class_90.method_1602(var0, var1, "openjs", 1962766571);
   }

   // $FF: renamed from: r (java.lang.String, int) boolean
   static boolean method_2957(String var0, int var1) {
      return class_90.method_1602(var0, var1, "openjs", 258121915);
   }

   // $FF: renamed from: n (int, int) java.lang.String
   static String method_2958(int var0, int var1) {
      try {
         return "<col=" + Integer.toHexString(var0) + ">";
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "aq.n(" + ')');
      }
   }

   // $FF: renamed from: d (java.lang.String, int, java.lang.String) boolean
   static boolean method_2959(String var0, int var1, String var2) {
      if(var1 == 0) {
         try {
            if(!field_1751.startsWith("win")) {
               throw new Exception();
            } else if(!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if(var10.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if(var1 == 1) {
         try {
            Object var3 = class_129.method_2854(field_1755, var2, new Object[]{(new URL(field_1755.getCodeBase(), var0)).toString()}, (short)-4888);
            return var3 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if(2 == var1) {
         try {
            field_1755.getAppletContext().showDocument(new URL(field_1755.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if(3 == var1) {
         try {
            class_129.method_2853(field_1755, "loggedout", 901657187);
         } catch (Throwable var9) {
            ;
         }

         try {
            field_1755.getAppletContext().showDocument(new URL(field_1755.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: gi (cy, int) void
   static final void method_2960(class_98 var0, int var1) {
      try {
         var0.field_1095 = false;
         class_72 var2;
         if(var0.field_1082 * -330797761 != -1) {
            label250: {
               if(var1 <= -640311406) {
                  return;
               }

               var2 = class_162.method_3412(var0.field_1082 * -330797761, -697394480);
               if(null != var2) {
                  if(var1 <= -640311406) {
                     throw new IllegalStateException();
                  }

                  if(var2.field_568 != null) {
                     if(var1 <= -640311406) {
                        throw new IllegalStateException();
                     }

                     var0.field_1135 += -2015567489;
                     if(1832573289 * var0.field_1091 < var2.field_568.length && var0.field_1135 * 572579455 > var2.field_570[var0.field_1091 * 1832573289]) {
                        if(var1 <= -640311406) {
                           return;
                        }

                        var0.field_1135 = -2015567489;
                        var0.field_1091 += -67942695;
                        class_148.method_3126(var2, 1832573289 * var0.field_1091, -130212619 * var0.field_1077, 1248597615 * var0.field_1076, -441850220);
                     }

                     if(1832573289 * var0.field_1091 >= var2.field_568.length) {
                        if(var1 <= -640311406) {
                           throw new IllegalStateException();
                        }

                        var0.field_1135 = 0;
                        var0.field_1091 = 0;
                        class_148.method_3126(var2, var0.field_1091 * 1832573289, var0.field_1077 * -130212619, var0.field_1076 * 1248597615, 534803487);
                     }
                     break label250;
                  }
               }

               var0.field_1082 = 404487489;
            }
         }

         if(-1 != var0.field_1113 * -1915525677) {
            if(var1 <= -640311406) {
               return;
            }

            if(client.field_1425 * -1702273423 >= var0.field_1127 * 58747199) {
               if(var1 <= -640311406) {
                  throw new IllegalStateException();
               }

               if(var0.field_1102 * 479634489 < 0) {
                  if(var1 <= -640311406) {
                     throw new IllegalStateException();
                  }

                  var0.field_1102 = 0;
               }

               int var5 = class_84.method_1417(-1915525677 * var0.field_1113, (short)-9783).field_683 * -814046371;
               if(var5 != -1) {
                  label253: {
                     if(var1 <= -640311406) {
                        throw new IllegalStateException();
                     }

                     class_72 var3 = class_162.method_3412(var5, -13609460);
                     if(var3 != null) {
                        if(var1 <= -640311406) {
                           throw new IllegalStateException();
                        }

                        if(var3.field_568 != null) {
                           if(var1 <= -640311406) {
                              throw new IllegalStateException();
                           }

                           var0.field_1115 += 1448682529;
                           if(479634489 * var0.field_1102 < var3.field_568.length) {
                              if(var1 <= -640311406) {
                                 throw new IllegalStateException();
                              }

                              if(-1084268575 * var0.field_1115 > var3.field_570[479634489 * var0.field_1102]) {
                                 if(var1 <= -640311406) {
                                    throw new IllegalStateException();
                                 }

                                 var0.field_1115 = 1448682529;
                                 var0.field_1102 += -493221367;
                                 class_148.method_3126(var3, 479634489 * var0.field_1102, -130212619 * var0.field_1077, var0.field_1076 * 1248597615, -1353639896);
                              }
                           }

                           if(var0.field_1102 * 479634489 >= var3.field_568.length) {
                              if(var1 <= -640311406) {
                                 throw new IllegalStateException();
                              }

                              if(479634489 * var0.field_1102 >= 0) {
                                 if(var1 <= -640311406) {
                                    throw new IllegalStateException();
                                 }

                                 if(479634489 * var0.field_1102 < var3.field_568.length) {
                                    break label253;
                                 }

                                 if(var1 <= -640311406) {
                                    throw new IllegalStateException();
                                 }
                              }

                              var0.field_1113 = -1634941531;
                           }
                           break label253;
                        }
                     }

                     var0.field_1113 = -1634941531;
                  }
               } else {
                  var0.field_1113 = -1634941531;
               }
            }
         }

         if(-1762760413 * var0.field_1108 != -1) {
            if(var1 <= -640311406) {
               return;
            }

            if(-1848146093 * var0.field_1111 <= 1) {
               if(var1 <= -640311406) {
                  throw new IllegalStateException();
               }

               var2 = class_162.method_3412(-1762760413 * var0.field_1108, -1757355742);
               if(1 == var2.field_573 * -1960140293) {
                  if(var1 <= -640311406) {
                     throw new IllegalStateException();
                  }

                  if(var0.field_1114 * 313310131 > 0) {
                     if(var1 <= -640311406) {
                        return;
                     }

                     if(-611848265 * var0.field_1105 <= -1702273423 * client.field_1425) {
                        if(var1 <= -640311406) {
                           throw new IllegalStateException();
                        }

                        if(-61946015 * var0.field_1123 < client.field_1425 * -1702273423) {
                           var0.field_1111 = 2078823643;
                           return;
                        }
                     }
                  }
               }
            }
         }

         if(-1762760413 * var0.field_1108 != -1 && 0 == -1848146093 * var0.field_1111) {
            label257: {
               if(var1 <= -640311406) {
                  throw new IllegalStateException();
               }

               var2 = class_162.method_3412(-1762760413 * var0.field_1108, 1550733084);
               if(var2 != null) {
                  if(var1 <= -640311406) {
                     throw new IllegalStateException();
                  }

                  if(var2.field_568 != null) {
                     if(var1 <= -640311406) {
                        throw new IllegalStateException();
                     }

                     var0.field_1110 += 643416439;
                     if(var0.field_1131 * 2078717111 < var2.field_568.length) {
                        if(var1 <= -640311406) {
                           return;
                        }

                        if(643131463 * var0.field_1110 > var2.field_570[var0.field_1131 * 2078717111]) {
                           if(var1 <= -640311406) {
                              throw new IllegalStateException();
                           }

                           var0.field_1110 = 643416439;
                           var0.field_1131 += -906073849;
                           class_148.method_3126(var2, var0.field_1131 * 2078717111, var0.field_1077 * -130212619, 1248597615 * var0.field_1076, 1943886482);
                        }
                     }

                     if(2078717111 * var0.field_1131 >= var2.field_568.length) {
                        if(var1 <= -640311406) {
                           throw new IllegalStateException();
                        }

                        var0.field_1131 -= -1135932511 * var2.field_567;
                        var0.field_1085 += 1588588449;
                        if(var0.field_1085 * 272217185 >= 692165837 * var2.field_578) {
                           if(var1 <= -640311406) {
                              throw new IllegalStateException();
                           }

                           var0.field_1108 = 1152446837;
                        } else {
                           label197: {
                              if(2078717111 * var0.field_1131 >= 0) {
                                 if(var1 <= -640311406) {
                                    throw new IllegalStateException();
                                 }

                                 if(var0.field_1131 * 2078717111 < var2.field_568.length) {
                                    class_148.method_3126(var2, 2078717111 * var0.field_1131, var0.field_1077 * -130212619, var0.field_1076 * 1248597615, 1024301762);
                                    break label197;
                                 }

                                 if(var1 <= -640311406) {
                                    throw new IllegalStateException();
                                 }
                              }

                              var0.field_1108 = 1152446837;
                           }
                        }
                     }

                     var0.field_1095 = var2.field_572;
                     break label257;
                  }
               }

               var0.field_1108 = 1152446837;
            }
         }

         if(var0.field_1111 * -1848146093 > 0) {
            var0.field_1111 -= 2078823643;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "aq.gi(" + ')');
      }
   }

   // $FF: renamed from: p (java.lang.String, int) boolean
   static boolean method_2961(String var0, int var1) {
      return class_90.method_1602(var0, var1, "openjs", 219637408);
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_1755 = null;
      field_1751 = "";
   }

   // $FF: renamed from: gh (byte) boolean
   static boolean method_2963(byte var0) {
      try {
         return 0 != (client.field_1584 * -1493328845 & 2);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "aq.gh(" + ')');
      }
   }
}
