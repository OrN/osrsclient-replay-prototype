import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import javax.imageio.ImageIO;

// $FF: renamed from: ao
public class class_135 {

   // $FF: renamed from: n int
   static final int field_1745 = 1;
   // $FF: renamed from: bg int
   public static final int field_1746 = 96;
   // $FF: renamed from: fr int
   static final int field_1747 = 104;
   // $FF: renamed from: bi int
   static final int field_1748 = 89;
   // $FF: renamed from: sx lh
   static class_350 field_1749;
   // $FF: renamed from: b int
   public static final int field_1750 = 9;


   // $FF: renamed from: n (byte[]) oh
   public static final class_67 method_2939(byte[] var0) {
      BufferedImage var1 = null;

      class_67 var10000;
      try {
         var1 = ImageIO.read(new ByteArrayInputStream(var0));
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var2 * var3];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
         var5.grabPixels();
         var10000 = new class_67(var4, var2, var3);
         return var10000;
      } catch (IOException var6) {
         ;
      } catch (InterruptedException var7) {
         ;
      }

      var10000 = new class_67(0, 0);
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static {
      ImageIO.setUseCache(false);
   }

   // $FF: renamed from: f (byte[]) oh
   public static final class_67 method_2941(byte[] var0) {
      BufferedImage var1 = null;

      class_67 var10000;
      try {
         var1 = ImageIO.read(new ByteArrayInputStream(var0));
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var2 * var3];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
         var5.grabPixels();
         var10000 = new class_67(var4, var2, var3);
         return var10000;
      } catch (IOException var6) {
         ;
      } catch (InterruptedException var7) {
         ;
      }

      var10000 = new class_67(0, 0);
      return var10000;
   }

   // $FF: renamed from: l (java.lang.String, int) java.lang.String
   public static String method_2942(String var0, int var1) {
      try {
         int var2 = var0.length();
         char[] var3 = new char[var2];
         byte var4 = 2;

         for(int var5 = 0; var5 < var2; ++var5) {
            if(var1 >= -236706915) {
               throw new IllegalStateException();
            }

            char var6 = var0.charAt(var5);
            if(0 == var4) {
               if(var1 >= -236706915) {
                  throw new IllegalStateException();
               }

               var6 = Character.toLowerCase(var6);
            } else {
               label79: {
                  if(2 != var4) {
                     if(var1 >= -236706915) {
                        throw new IllegalStateException();
                     }

                     if(!Character.isUpperCase(var6)) {
                        break label79;
                     }

                     if(var1 >= -236706915) {
                        throw new IllegalStateException();
                     }
                  }

                  var6 = class_359.method_6292(var6, 717003887);
               }
            }

            if(Character.isLetter(var6)) {
               var4 = 0;
            } else {
               label71: {
                  if(46 != var6) {
                     if(var1 >= -236706915) {
                        throw new IllegalStateException();
                     }

                     if(var6 != 63) {
                        if(var1 >= -236706915) {
                           throw new IllegalStateException();
                        }

                        if(var6 != 33) {
                           if(Character.isSpaceChar(var6)) {
                              if(var4 != 2) {
                                 if(var1 >= -236706915) {
                                    throw new IllegalStateException();
                                 }

                                 var4 = 1;
                              }
                           } else {
                              var4 = 1;
                           }
                           break label71;
                        }

                        if(var1 >= -236706915) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  var4 = 2;
               }
            }

            var3[var5] = var6;
         }

         return new String(var3);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "ao.l(" + ')');
      }
   }

   // $FF: renamed from: kx (cu, boolean, int) void
   static final void method_2943(class_48 var0, boolean var1, int var2) {
      try {
         int var3 = var0.field_353 * 897280301;
         int var4 = (int)var0.field_9;
         var0.method_108();
         if(var1) {
            if(var2 >= -16163958) {
               throw new IllegalStateException();
            }

            if(var3 != -1) {
               if(!class_37.field_94[var3]) {
                  if(var2 >= -16163958) {
                     throw new IllegalStateException();
                  }
               } else {
                  class_46.field_343.method_5396(var3, -1289634866);
                  if(class_37.field_93[var3] == null) {
                     if(var2 >= -16163958) {
                        throw new IllegalStateException();
                     }
                  } else {
                     boolean var5 = true;

                     for(int var6 = 0; var6 < class_37.field_93[var3].length; ++var6) {
                        if(null != class_37.field_93[var3][var6]) {
                           if(var2 >= -16163958) {
                              throw new IllegalStateException();
                           }

                           if(2 != 1659206769 * class_37.field_93[var3][var6].field_103) {
                              if(var2 >= -16163958) {
                                 throw new IllegalStateException();
                              }

                              class_37.field_93[var3][var6] = null;
                           } else {
                              var5 = false;
                           }
                        }
                     }

                     if(var5) {
                        if(var2 >= -16163958) {
                           throw new IllegalStateException();
                        }

                        class_37.field_93[var3] = null;
                     }

                     class_37.field_94[var3] = false;
                  }
               }
            }
         }

         for(class_32 var8 = (class_32)client.field_1623.method_6531(); null != var8; var8 = (class_32)client.field_1623.method_6527()) {
            if(var2 >= -16163958) {
               throw new IllegalStateException();
            }

            if((var8.field_9 >> 48 & 65535L) == (long)var3) {
               if(var2 >= -16163958) {
                  throw new IllegalStateException();
               }

               var8.method_108();
            }
         }

         class_37 var9 = class_71.method_1047(var4, 1407289296);
         if(null != var9) {
            if(var2 >= -16163958) {
               return;
            }

            class_254.method_4900(var9, (byte)38);
         }

         class_56.method_588((byte)1);
         if(-1 != client.field_1412 * 1338880923) {
            if(var2 >= -16163958) {
               throw new IllegalStateException();
            }

            class_177.method_3761(1338880923 * client.field_1412, 1, 1880563632);
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "ao.kx(" + ')');
      }
   }

   // $FF: renamed from: r (int, cf, boolean, int) int
   static int method_2944(int var0, class_90 var1, boolean var2, int var3) {
      try {
         class_37 var4;
         if(var0 >= 2000) {
            if(var3 == 48739182) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var4 = class_71.method_1047(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885], 401041671);
         } else {
            class_37 var10000;
            if(var2) {
               if(var3 == 48739182) {
                  throw new IllegalStateException();
               }

               var10000 = class_124.field_1357;
            } else {
               var10000 = class_165.field_2064;
            }

            var4 = var10000;
         }

         class_254.method_4900(var4, (byte)116);
         if(1200 != var0 && 1205 != var0) {
            if(var0 != 1212) {
               if(1201 == var0) {
                  if(var3 == 48739182) {
                     throw new IllegalStateException();
                  }

                  var4.field_144 = 370516982;
                  var4.field_145 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * -252507035;
                  return 1;
               }

               if(1202 == var0) {
                  if(var3 == 48739182) {
                     throw new IllegalStateException();
                  }

                  var4.field_144 = 555775473;
                  var4.field_145 = class_164.field_2044.field_1143.method_5093(-1167283796) * -252507035;
                  return 1;
               }

               return 2;
            }

            if(var3 == 48739182) {
               throw new IllegalStateException();
            }
         }

         class_136.field_1752 -= 2119512838;
         int var5 = class_165.field_2052[class_136.field_1752 * -26460885];
         int var6 = class_165.field_2052[class_136.field_1752 * -26460885 + 1];
         var4.field_229 = -145071707 * var5;
         var4.field_161 = var6 * -1943101049;
         class_80 var7 = class_299.method_5347(var5, -595727482);
         var4.field_142 = var7.field_733 * -634708543;
         var4.field_153 = var7.field_714 * 1271973011;
         var4.field_137 = -2017546435 * var7.field_715;
         var4.field_150 = -125333263 * var7.field_716;
         var4.field_151 = var7.field_717 * 1363851317;
         var4.field_205 = 171073169 * var7.field_713;
         if(1205 == var0) {
            if(var3 == 48739182) {
               throw new IllegalStateException();
            }

            var4.field_160 = 0;
         } else {
            boolean var9 = var0 == 1212;
            boolean var10001;
            if(1 == -1049731853 * var7.field_705) {
               if(var3 == 48739182) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if(var9 | var10001) {
               if(var3 == 48739182) {
                  throw new IllegalStateException();
               }

               var4.field_160 = -1656645413;
            } else {
               var4.field_160 = 981676470;
            }
         }

         if(-1993271177 * var4.field_156 > 0) {
            if(var3 == 48739182) {
               throw new IllegalStateException();
            }

            var4.field_205 = -922077133 * (-646946976 * var4.field_205 / (var4.field_156 * -1993271177));
         } else if(var4.field_112 * 1593997171 > 0) {
            if(var3 == 48739182) {
               throw new IllegalStateException();
            }

            var4.field_205 = -922077133 * (-646946976 * var4.field_205 / (var4.field_112 * 1593997171));
         }

         return 1;
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "ao.r(" + ')');
      }
   }

   // $FF: renamed from: aj (int, short) int
   static int method_2945(int var0, short var1) {
      try {
         return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ao.aj(" + ')');
      }
   }

   // $FF: renamed from: j (int) void
   static void method_2946(int var0) {
      try {
         class_197.field_2338.clear();
         class_197.field_2334.method_6596();
         class_197.field_2336.method_5807();
         class_197.field_2337 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ao.j(" + ')');
      }
   }

   // $FF: renamed from: az (int) int
   protected static int method_2947(int var0) {
      try {
         int var1;
         label66: {
            var1 = 0;
            if(null != class_198.field_2340) {
               if(var0 != -56748890) {
                  throw new IllegalStateException();
               }

               if(class_198.field_2340.isValid()) {
                  break label66;
               }

               if(var0 != -56748890) {
                  throw new IllegalStateException();
               }
            }

            try {
               Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

               while(var2.hasNext()) {
                  if(var0 != -56748890) {
                     throw new IllegalStateException();
                  }

                  GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
                  if(var3.isValid()) {
                     if(var0 != -56748890) {
                        throw new IllegalStateException();
                     }

                     class_198.field_2340 = var3;
                     GameApplet.field_1403 = 4302826277310093293L;
                     GameApplet.field_1379 = 7975047348458726733L;
                  }
               }
            } catch (Throwable var10) {
               ;
            }
         }

         if(class_198.field_2340 != null) {
            if(var0 != -56748890) {
               throw new IllegalStateException();
            }

            long var12 = class_87.method_1516((byte)1);
            long var4 = class_198.field_2340.getCollectionTime();
            if(-1L != 6246927008582722683L * GameApplet.field_1379) {
               if(var0 != -56748890) {
                  throw new IllegalStateException();
               }

               long var6 = var4 - GameApplet.field_1379 * 6246927008582722683L;
               long var8 = var12 - -7805304911218154981L * GameApplet.field_1403;
               if(0L != var8) {
                  if(var0 != -56748890) {
                     throw new IllegalStateException();
                  }

                  var1 = (int)(100L * var6 / var8);
               }
            }

            GameApplet.field_1379 = -7975047348458726733L * var4;
            GameApplet.field_1403 = -4302826277310093293L * var12;
         }

         return var1;
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "ao.az(" + ')');
      }
   }

   // $FF: renamed from: j (byte[], int, int, byte) java.lang.String
   public static String method_2948(byte[] var0, int var1, int var2, byte var3) {
      try {
         char[] var4 = new char[var2];
         int var5 = 0;

         for(int var6 = 0; var6 < var2; ++var6) {
            if(var3 <= 1) {
               throw new IllegalStateException();
            }

            int var7 = var0[var1 + var6] & 255;
            if(var7 == 0) {
               if(var3 <= 1) {
                  throw new IllegalStateException();
               }
            } else {
               if(var7 >= 128) {
                  if(var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  if(var7 < 160) {
                     if(var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     char var8 = class_337.field_3881[var7 - 128];
                     if(0 == var8) {
                        if(var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        var8 = 63;
                     }

                     var7 = var8;
                  }
               }

               var4[var5++] = (char)var7;
            }
         }

         return new String(var4, 0, var5);
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "ao.j(" + ')');
      }
   }

   // $FF: renamed from: fc (int) int
   static int method_2949(int var0) {
      try {
         if(null != client.field_1690) {
            if(var0 <= '\uffff') {
               throw new IllegalStateException();
            }

            if(-1953954605 * client.field_1488 < client.field_1690.size()) {
               int var1 = 0;

               for(int var2 = 0; var2 <= client.field_1488 * -1953954605; ++var2) {
                  if(var0 <= '\uffff') {
                     throw new IllegalStateException();
                  }

                  var1 += ((class_169)client.field_1690.get(var2)).field_2107 * -1897441913;
               }

               return 10000 * var1 / (112640073 * client.field_1692);
            }
         }

         return 10000;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ao.fc(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   class_135() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ao.<init>(" + ')');
      }
   }

   // $FF: renamed from: n (int, int, int, byte) cf
   static class_90 method_2951(int var0, int var1, int var2, byte var3) {
      try {
         int var4 = var0 + (var1 << 8);
         class_90 var7 = (class_90)class_90.field_901.method_5065((long)(var4 << 16));
         class_90 var6;
         if(var7 != null) {
            if(var3 >= 1) {
               throw new IllegalStateException();
            }

            var6 = var7;
         } else {
            String var8 = String.valueOf(var4);
            int var9 = class_189.field_2275.method_5399(var8, -1476545611);
            if(var9 == -1) {
               if(var3 >= 1) {
                  throw new IllegalStateException();
               }

               var6 = null;
            } else {
               label111: {
                  byte[] var10 = class_189.field_2275.method_5388(var9, (byte)-23);
                  if(var10 != null) {
                     if(var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     if(var10.length <= 1) {
                        if(var3 >= 1) {
                           throw new IllegalStateException();
                        }

                        var6 = null;
                        break label111;
                     }

                     var7 = class_343.method_6116(var10, 1132367592);
                     if(null != var7) {
                        if(var3 >= 1) {
                           throw new IllegalStateException();
                        }

                        class_90.field_901.method_5064(var7, (long)(var4 << 16));
                        var6 = var7;
                        break label111;
                     }
                  }

                  var6 = null;
               }
            }
         }

         if(null != var6) {
            if(var3 >= 1) {
               throw new IllegalStateException();
            } else {
               return var6;
            }
         } else {
            int var15 = (-3 - var2 << 8) + var0;
            class_90 var17 = (class_90)class_90.field_901.method_5065((long)(var15 << 16));
            class_90 var16;
            if(var17 != null) {
               if(var3 >= 1) {
                  throw new IllegalStateException();
               }

               var16 = var17;
            } else {
               String var11 = String.valueOf(var15);
               int var12 = class_189.field_2275.method_5399(var11, -1543379294);
               if(var12 == -1) {
                  if(var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var16 = null;
               } else {
                  label100: {
                     byte[] var13 = class_189.field_2275.method_5388(var12, (byte)-21);
                     if(var13 != null) {
                        if(var3 >= 1) {
                           throw new IllegalStateException();
                        }

                        if(var13.length <= 1) {
                           if(var3 >= 1) {
                              throw new IllegalStateException();
                           }

                           var16 = null;
                           break label100;
                        }

                        var17 = class_343.method_6116(var13, 1132367592);
                        if(var17 != null) {
                           class_90.field_901.method_5064(var17, (long)(var15 << 16));
                           var16 = var17;
                           break label100;
                        }
                     }

                     var16 = null;
                  }
               }
            }

            if(var16 != null) {
               if(var3 >= 1) {
                  throw new IllegalStateException();
               } else {
                  return var16;
               }
            } else {
               return null;
            }
         }
      } catch (RuntimeException var14) {
         throw class_223.method_4281(var14, "ao.n(" + ')');
      }
   }
}
