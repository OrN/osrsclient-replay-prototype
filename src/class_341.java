import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

// $FF: renamed from: ll
public class class_341 extends class_339 {

    // $FF: renamed from: n lu
   class_357 field_3893;
   // $FF: renamed from: ea jp
   static class_307 field_3894;
   // $FF: renamed from: v lu
   class_357 field_3895;


    // $FF: renamed from: v (int) void
   void method_6029() {
      try {
         this.field_3895 = class_357.field_3980;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: c (int) boolean
   public final boolean method_6030(int var1) {
      try {
         if(class_357.field_3980 == this.field_3893) {
            if(var1 != 601254132) {
               throw new IllegalStateException();
            }

            this.method_6033(-440591589);
         }

         boolean var10000;
         if(this.field_3893 == class_357.field_3979) {
            if(var1 != 601254132) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (short) void
   void method_6031(short var1) {
      try {
         class_357 var10001;
         if(class_208.field_2413.field_1994.method_6063(this.field_3883, -234571238)) {
            if(var1 != 256) {
               return;
            }

            var10001 = class_357.field_3979;
         } else {
            var10001 = class_357.field_3978;
         }

         this.field_3895 = var10001;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: e (int) void
   void method_6033(int var1) {
      try {
         class_357 var10001;
         if(class_208.field_2413.field_1995.method_6063(this.field_3883, -234571238)) {
            if(var1 >= 2101998419) {
               throw new IllegalStateException();
            }

            var10001 = class_357.field_3979;
         } else {
            var10001 = class_357.field_3978;
         }

         this.field_3893 = var10001;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: p (byte) void
   void method_6035() {
      try {
         this.field_3893 = class_357.field_3980;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: f (int) boolean
   public final boolean method_6044(int var1) {
      try {
         if(this.field_3895 == class_357.field_3980) {
            if(var1 <= 1647125333) {
               throw new IllegalStateException();
            }

            this.method_6031((short)256);
         }

         boolean var10000;
         if(this.field_3895 == class_357.field_3979) {
            if(var1 <= 1647125333) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: d (int) void
   static void method_6049(int var0) {
      try {
         class_177.field_2200 = class_177.field_2200.trim();
         if(class_177.field_2200.length() == 0) {
            if(var0 != -1024085126) {
               throw new IllegalStateException();
            } else {
               class_299.method_5348(class_305.field_3669, class_305.field_3670, class_305.field_3641);
            }
         } else {
            long var2;
            class_28 var10000;
            try {
               URL var4 = new URL(class_83.method_1409("services", false, 62678309) + "m=accountappeal/login.ws");
               URLConnection var5 = var4.openConnection();
               var5.setRequestProperty("connection", "close");
               var5.setDoInput(true);
               var5.setDoOutput(true);
               var5.setConnectTimeout(5000);
               OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
               var6.write("data1=req");
               var6.flush();
               InputStream var7 = var5.getInputStream();
               var10000 = new class_28(new byte[1000]);
               class_28 var8 = var10000;

               while(true) {
                  int var9 = var7.read(var8.field_12, -442398587 * var8.field_15, 1000 - -442398587 * var8.field_15);
                  if(var9 == -1) {
                     if(var0 != -1024085126) {
                        throw new IllegalStateException();
                     }

                     var8.field_15 = 0;
                     long var31 = var8.method_136();
                     var2 = var31;
                     break;
                  }

                  var8.field_15 += -1025691571 * var9;
                  if(-442398587 * var8.field_15 >= 1000) {
                     if(var0 != -1024085126) {
                        throw new IllegalStateException();
                     }

                     var2 = 0L;
                     break;
                  }
               }
            } catch (Exception var26) {
               var2 = 0L;
            }

            byte var1;
            if(var2 == 0L) {
               var1 = 5;
            } else {
               String var29 = class_177.field_2200;
               Random var30 = new Random();
               var10000 = new class_28(128);
               class_28 var32 = var10000;
               var10000 = new class_28(128);
               class_28 var10 = var10000;
               int[] var11 = new int[]{var30.nextInt(), var30.nextInt(), (int)(var2 >> 32), (int)var2};
               var32.method_210(10);

               int var12;
               for(var12 = 0; var12 < 4; ++var12) {
                  if(var0 != -1024085126) {
                     throw new IllegalStateException();
                  }

                  var32.method_116(var30.nextInt());
               }

               var32.method_116(var11[0]);
               var32.method_116(var11[1]);
               var32.method_341(var2);
               var32.method_341(0L);

               for(var12 = 0; var12 < 4; ++var12) {
                  if(var0 != -1024085126) {
                     return;
                  }

                  var32.method_116(var30.nextInt());
               }

               var32.method_153(class_179.field_2226, class_179.field_2227);
               var10.method_210(10);

               for(var12 = 0; var12 < 3; ++var12) {
                  if(var0 != -1024085126) {
                     return;
                  }

                  var10.method_116(var30.nextInt());
               }

               var10.method_341(var30.nextLong());
               var10.method_117(var30.nextLong());
               if(client.field_1457 != null) {
                  if(var0 != -1024085126) {
                     throw new IllegalStateException();
                  }

                  var10.method_161(client.field_1457, 0, client.field_1457.length);
               } else {
                  byte[] var13 = new byte[24];

                  try {
                     class_199.field_2344.method_6628(0L);
                     class_199.field_2344.method_6630(var13);

                     int var14;
                     for(var14 = 0; var14 < 24; ++var14) {
                        if(var0 != -1024085126) {
                           throw new IllegalStateException();
                        }

                        if(0 != var13[var14]) {
                           if(var0 != -1024085126) {
                              throw new IllegalStateException();
                           }
                           break;
                        }
                     }

                     if(var14 >= 24) {
                        if(var0 != -1024085126) {
                           throw new IllegalStateException();
                        }

                        throw new IOException();
                     }
                  } catch (Exception var25) {
                     for(int var15 = 0; var15 < 24; ++var15) {
                        if(var0 != -1024085126) {
                           return;
                        }

                        var13[var15] = -1;
                     }
                  }

                  var10.method_161(var13, 0, var13.length);
               }

               var10.method_341(var30.nextLong());
               var10.method_153(class_179.field_2226, class_179.field_2227);
               var12 = class_166.method_3598(var29);
               if(var12 % 8 != 0) {
                  var12 += 8 - var12 % 8;
               }

               var10000 = new class_28(var12);
               class_28 var33 = var10000;
               var33.method_120(var29);
               var33.field_15 = var12 * -1025691571;
               var33.method_232(var11, -1937738349);
               var10000 = new class_28(-442398587 * var33.field_15 + 5 + -442398587 * var32.field_15 + -442398587 * var10.field_15);
               class_28 var34 = var10000;
               var34.method_210(2);
               var34.method_210(var32.field_15 * -442398587);
               var34.method_161(var32.field_12, 0, -442398587 * var32.field_15);
               var34.method_210(-442398587 * var10.field_15);
               var34.method_161(var10.field_12, 0, var10.field_15 * -442398587);
               var34.method_333(var33.field_15 * -442398587);
               var34.method_161(var33.field_12, 0, -442398587 * var33.field_15);
               byte[] var16 = var34.field_12;
               int var18 = var16.length;
               StringBuilder var19 = new StringBuilder();

               int var22;
               for(int var20 = 0; var20 < 0 + var18; var20 += 3) {
                  if(var0 != -1024085126) {
                     throw new IllegalStateException();
                  }

                  int var21 = var16[var20] & 255;
                  var19.append(class_318.field_3789[var21 >>> 2]);
                  if(var20 < var18 - 1) {
                     if(var0 != -1024085126) {
                        throw new IllegalStateException();
                     }

                     var22 = var16[var20 + 1] & 255;
                     var19.append(class_318.field_3789[(var21 & 3) << 4 | var22 >>> 4]);
                     if(var20 < var18 - 2) {
                        if(var0 != -1024085126) {
                           throw new IllegalStateException();
                        }

                        int var23 = var16[var20 + 2] & 255;
                        var19.append(class_318.field_3789[(var22 & 15) << 2 | var23 >>> 6]).append(class_318.field_3789[var23 & 63]);
                     } else {
                        var19.append(class_318.field_3789[(var22 & 15) << 2]).append("=");
                     }
                  } else {
                     var19.append(class_318.field_3789[(var21 & 3) << 4]).append("==");
                  }
               }

               String var17 = var19.toString();
               var17 = var17;

               byte var28;
               try {
                  URL var35 = new URL(class_83.method_1409("services", false, -1777751940) + "m=accountappeal/login.ws");
                  URLConnection var36 = var35.openConnection();
                  var36.setDoInput(true);
                  var36.setDoOutput(true);
                  var36.setConnectTimeout(5000);
                  OutputStreamWriter var37 = new OutputStreamWriter(var36.getOutputStream());
                  var37.write("data2=" + class_73.method_1117(var17, -899515900) + "&dest=" + class_73.method_1117("passwordchoice.ws", -103587308));
                  var37.flush();
                  InputStream var38 = var36.getInputStream();
                  var10000 = new class_28(new byte[1000]);
                  var34 = var10000;

                  while(true) {
                     var22 = var38.read(var34.field_12, -442398587 * var34.field_15, 1000 - var34.field_15 * -442398587);
                     if(var22 == -1) {
                        if(var0 != -1024085126) {
                           return;
                        }

                        var37.close();
                        var38.close();
                        String var39 = new String(var34.field_12);
                        if(var39.startsWith("OFFLINE")) {
                           if(var0 != -1024085126) {
                              throw new IllegalStateException();
                           }

                           var28 = 4;
                        } else if(var39.startsWith("WRONG")) {
                           if(var0 != -1024085126) {
                              throw new IllegalStateException();
                           }

                           var28 = 7;
                        } else if(var39.startsWith("RELOAD")) {
                           if(var0 != -1024085126) {
                              throw new IllegalStateException();
                           }

                           var28 = 3;
                        } else if(var39.startsWith("Not permitted for social network accounts.")) {
                           var28 = 6;
                        } else {
                           var34.method_150(var11, 1314548709);

                           while(var34.field_15 * -442398587 > 0) {
                              if(var0 != -1024085126) {
                                 throw new IllegalStateException();
                              }

                              if(var34.field_12[var34.field_15 * -442398587 - 1] != 0) {
                                 break;
                              }

                              if(var0 != -1024085126) {
                                 return;
                              }

                              var34.field_15 -= -1025691571;
                           }

                           var39 = new String(var34.field_12, 0, var34.field_15 * -442398587);
                           if(class_165.method_3516(var39, (byte)-3)) {
                              if(var0 != -1024085126) {
                                 throw new IllegalStateException();
                              }

                              class_195.method_3988(var39, true, false, 2086838363);
                              var28 = 2;
                           } else {
                              var28 = 5;
                           }
                        }
                        break;
                     }

                     var34.field_15 += -1025691571 * var22;
                     if(-442398587 * var34.field_15 >= 1000) {
                        var28 = 5;
                        break;
                     }
                  }
               } catch (Throwable var24) {
                  var24.printStackTrace();
                  var28 = 5;
               }

               var1 = var28;
            }

            switch(var1) {
            case 2:
               class_299.method_5348(class_305.field_3672, class_305.field_3673, class_305.field_3674);
               class_177.field_2194 = -412112718;
               break;
            case 3:
               class_299.method_5348(class_305.field_3675, class_305.field_3676, class_305.field_3677);
               break;
            case 4:
               class_299.method_5348(class_305.field_3678, class_305.field_3528, class_305.field_3680);
               break;
            case 5:
               class_299.method_5348(class_305.field_3436, class_305.field_3541, class_305.field_3683);
               break;
            case 6:
               class_299.method_5348(class_305.field_3684, class_305.field_3685, class_305.field_3686);
               break;
            case 7:
               class_299.method_5348(class_305.field_3687, class_305.field_3516, class_305.field_3508);
            }

         }
      } catch (RuntimeException var27) {
         throw class_223.method_4281(var27);
      }
   }

    // $FF: renamed from: <init> () void
   class_341() {
      super();
      try {
         this.field_3895 = class_357.field_3980;
         this.field_3893 = class_357.field_3980;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

}
