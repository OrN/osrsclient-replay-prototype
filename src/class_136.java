import java.applet.Applet;

// $FF: renamed from: aq
public class class_136 {

   // $FF: renamed from: n java.lang.String
   public static String field_1751;
   // $FF: renamed from: u int
   static int field_1752;
    // $FF: renamed from: v java.applet.Applet
   public static Applet field_1755;


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
         throw class_223.method_4281(var7);
      }
   }

    // $FF: renamed from: n (int, int) java.lang.String
   static String method_2958(int var0) {
      try {
         return "<col=" + Integer.toHexString(var0) + ">";
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
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
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_1755 = null;
      field_1751 = "";
   }

   // $FF: renamed from: gh (byte) boolean
   static boolean method_2963() {
      try {
         return 0 != (client.field_1584 * -1493328845 & 2);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }
}
