import java.net.URL;

// $FF: renamed from: cf
public class class_90 extends class_59 {

   // $FF: renamed from: n java.lang.String
   String field_899;
   // $FF: renamed from: jx io
   static class_37 field_900;
   // $FF: renamed from: v hz
   static class_272 field_901;
   // $FF: renamed from: y int[]
   int[] field_902;
   // $FF: renamed from: f int[]
   int[] field_903;
   // $FF: renamed from: j int
   int field_904;
   // $FF: renamed from: r int
   int field_905;
   // $FF: renamed from: b int
   int field_906;
   // $FF: renamed from: d int
   int field_907;
   // $FF: renamed from: s mr[]
   class_369[] field_908;
   // $FF: renamed from: bf int
   static int field_909;
   // $FF: renamed from: p java.lang.String[]
   String[] field_910;


   // $FF: renamed from: r (int) cf
   static class_90 method_1589(int var0) {
      class_90 var1 = (class_90)field_901.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class_189.field_2275.method_5381(var0, 0, -26460885);
         if(var2 == null) {
            return null;
         } else {
            var1 = class_343.method_6116(var2, 1132367592);
            field_901.method_5064(var1, (long)var0);
            return var1;
         }
      }
   }

   // $FF: renamed from: b (int, int, int) cf
   static class_90 method_1590(int var0, int var1, int var2) {
      int var3 = var0 + (var1 << 8);
      class_90 var6 = (class_90)field_901.method_5065((long)(var3 << 16));
      class_90 var5;
      if(var6 != null) {
         var5 = var6;
      } else {
         String var7 = String.valueOf(var3);
         int var8 = class_189.field_2275.method_5399(var7, -910962369);
         if(var8 == -1) {
            var5 = null;
         } else {
            label70: {
               byte[] var9 = class_189.field_2275.method_5388(var8, (byte)-29);
               if(var9 != null) {
                  if(var9.length <= 1) {
                     var5 = null;
                     break label70;
                  }

                  var6 = class_343.method_6116(var9, 1132367592);
                  if(null != var6) {
                     field_901.method_5064(var6, (long)(var3 << 16));
                     var5 = var6;
                     break label70;
                  }
               }

               var5 = null;
            }
         }
      }

      if(null != var5) {
         return var5;
      } else {
         int var13 = (-3 - var2 << 8) + var0;
         class_90 var15 = (class_90)field_901.method_5065((long)(var13 << 16));
         class_90 var14;
         if(var15 != null) {
            var14 = var15;
         } else {
            String var10 = String.valueOf(var13);
            int var11 = class_189.field_2275.method_5399(var10, -966175438);
            if(var11 == -1) {
               var14 = null;
            } else {
               byte[] var12 = class_189.field_2275.method_5388(var11, (byte)-95);
               if(var12 != null) {
                  if(var12.length <= 1) {
                     var14 = null;
                     return var14 != null?var14:null;
                  }

                  var15 = class_343.method_6116(var12, 1132367592);
                  if(var15 != null) {
                     field_901.method_5064(var15, (long)(var13 << 16));
                     var14 = var15;
                     return var14 != null?var14:null;
                  }
               }

               var14 = null;
            }
         }

         return var14 != null?var14:null;
      }
   }

   // $FF: renamed from: p (int) cf
   static class_90 method_1591(int var0) {
      class_90 var1 = (class_90)field_901.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class_189.field_2275.method_5381(var0, 0, -26460885);
         if(var2 == null) {
            return null;
         } else {
            var1 = class_343.method_6116(var2, 1132367592);
            field_901.method_5064(var1, (long)var0);
            return var1;
         }
      }
   }

   // $FF: renamed from: y (int, int) mr[]
   class_369[] method_1592(int var1, int var2) {
      try {
         return new class_369[var1];
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "cf.y(" + ')');
      }
   }

   // $FF: renamed from: j (int) cf
   static class_90 method_1593(int var0) {
      class_90 var1 = (class_90)field_901.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class_189.field_2275.method_5381(var0, 0, -26460885);
         if(var2 == null) {
            return null;
         } else {
            var1 = class_343.method_6116(var2, 1132367592);
            field_901.method_5064(var1, (long)var0);
            return var1;
         }
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_1594() {
      class_272 var10000 = new class_272;
      var10000.method_5063(128);
      field_901 = var10000;
   }

   // $FF: renamed from: d (int, int, int) cf
   static class_90 method_1595(int var0, int var1, int var2) {
      int var3 = var0 + (var1 << 8);
      class_90 var6 = (class_90)field_901.method_5065((long)(var3 << 16));
      class_90 var5;
      if(var6 != null) {
         var5 = var6;
      } else {
         String var7 = String.valueOf(var3);
         int var8 = class_189.field_2275.method_5399(var7, -127726982);
         if(var8 == -1) {
            var5 = null;
         } else {
            label72: {
               byte[] var9 = class_189.field_2275.method_5388(var8, (byte)-61);
               if(var9 != null) {
                  if(var9.length <= 1) {
                     var5 = null;
                     break label72;
                  }

                  var6 = class_343.method_6116(var9, 1132367592);
                  if(null != var6) {
                     field_901.method_5064(var6, (long)(var3 << 16));
                     var5 = var6;
                     break label72;
                  }
               }

               var5 = null;
            }
         }
      }

      if(null != var5) {
         return var5;
      } else {
         int var13 = (-3 - var2 << 8) + var0;
         class_90 var15 = (class_90)field_901.method_5065((long)(var13 << 16));
         class_90 var14;
         if(var15 != null) {
            var14 = var15;
         } else {
            String var10 = String.valueOf(var13);
            int var11 = class_189.field_2275.method_5399(var10, -1152210369);
            if(var11 == -1) {
               var14 = null;
            } else {
               byte[] var12 = class_189.field_2275.method_5388(var11, (byte)-32);
               if(var12 != null) {
                  if(var12.length <= 1) {
                     var14 = null;
                     return var14 != null?var14:null;
                  }

                  var15 = class_343.method_6116(var12, 1132367592);
                  if(var15 != null) {
                     field_901.method_5064(var15, (long)(var13 << 16));
                     var14 = var15;
                     return var14 != null?var14:null;
                  }
               }

               var14 = null;
            }
         }

         return var14 != null?var14:null;
      }
   }

   // $FF: renamed from: <init> () void
   void method_105() {
      try {
         super.method_105();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cf.<init>(" + ')');
      }
   }

   // $FF: renamed from: s (int, int, int) cf
   static class_90 method_1596(int var0, int var1, int var2) {
      int var3 = var0 + (var1 << 8);
      class_90 var6 = (class_90)field_901.method_5065((long)(var3 << 16));
      class_90 var5;
      if(var6 != null) {
         var5 = var6;
      } else {
         String var7 = String.valueOf(var3);
         int var8 = class_189.field_2275.method_5399(var7, -491210838);
         if(var8 == -1) {
            var5 = null;
         } else {
            label76: {
               byte[] var9 = class_189.field_2275.method_5388(var8, (byte)-37);
               if(var9 != null) {
                  if(var9.length <= 1) {
                     var5 = null;
                     break label76;
                  }

                  var6 = class_343.method_6116(var9, 1132367592);
                  if(null != var6) {
                     field_901.method_5064(var6, (long)(var3 << 16));
                     var5 = var6;
                     break label76;
                  }
               }

               var5 = null;
            }
         }
      }

      if(null != var5) {
         return var5;
      } else {
         int var13 = (-3 - var2 << 8) + var0;
         class_90 var15 = (class_90)field_901.method_5065((long)(var13 << 16));
         class_90 var14;
         if(var15 != null) {
            var14 = var15;
         } else {
            String var10 = String.valueOf(var13);
            int var11 = class_189.field_2275.method_5399(var10, -1551120387);
            if(var11 == -1) {
               var14 = null;
            } else {
               byte[] var12 = class_189.field_2275.method_5388(var11, (byte)-51);
               if(var12 != null) {
                  if(var12.length <= 1) {
                     var14 = null;
                     return var14 != null?var14:null;
                  }

                  var15 = class_343.method_6116(var12, 1132367592);
                  if(var15 != null) {
                     field_901.method_5064(var15, (long)(var13 << 16));
                     var14 = var15;
                     return var14 != null?var14:null;
                  }
               }

               var14 = null;
            }
         }

         return var14 != null?var14:null;
      }
   }

   // $FF: renamed from: u (int, int, int) cf
   static class_90 method_1597(int var0, int var1, int var2) {
      int var3 = var0 + (var1 << 8);
      class_90 var6 = (class_90)field_901.method_5065((long)(var3 << 16));
      class_90 var5;
      if(var6 != null) {
         var5 = var6;
      } else {
         String var7 = String.valueOf(var3);
         int var8 = class_189.field_2275.method_5399(var7, -644996017);
         if(var8 == -1) {
            var5 = null;
         } else {
            label70: {
               byte[] var9 = class_189.field_2275.method_5388(var8, (byte)-84);
               if(var9 != null) {
                  if(var9.length <= 1) {
                     var5 = null;
                     break label70;
                  }

                  var6 = class_343.method_6116(var9, 1132367592);
                  if(null != var6) {
                     field_901.method_5064(var6, (long)(var3 << 16));
                     var5 = var6;
                     break label70;
                  }
               }

               var5 = null;
            }
         }
      }

      if(null != var5) {
         return var5;
      } else {
         int var13 = (-3 - var2 << 8) + var0;
         class_90 var15 = (class_90)field_901.method_5065((long)(var13 << 16));
         class_90 var14;
         if(var15 != null) {
            var14 = var15;
         } else {
            String var10 = String.valueOf(var13);
            int var11 = class_189.field_2275.method_5399(var10, -1185217627);
            if(var11 == -1) {
               var14 = null;
            } else {
               byte[] var12 = class_189.field_2275.method_5388(var11, (byte)-13);
               if(var12 != null) {
                  if(var12.length <= 1) {
                     var14 = null;
                     return var14 != null?var14:null;
                  }

                  var15 = class_343.method_6116(var12, 1132367592);
                  if(var15 != null) {
                     field_901.method_5064(var15, (long)(var13 << 16));
                     var14 = var15;
                     return var14 != null?var14:null;
                  }
               }

               var14 = null;
            }
         }

         return var14 != null?var14:null;
      }
   }

   // $FF: renamed from: l (byte[]) cf
   static class_90 method_1598(byte[] var0) {
      class_90 var10000 = new class_90;
      var10000.method_105();
      class_90 var1 = var10000;
      class_28 var12 = new class_28;
      var12.method_178(var0);
      class_28 var2 = var12;
      var2.field_15 = -1025691571 * (var2.field_12.length - 2);
      int var3 = var2.method_132((byte)-3);
      int var4 = var2.field_12.length - 2 - var3 - 12;
      var2.field_15 = var4 * -1025691571;
      int var5 = var2.method_135((byte)-66);
      var1.field_904 = var2.method_132((byte)-107) * -341761097;
      var1.field_905 = var2.method_132((byte)-22) * -465592225;
      var1.field_906 = var2.method_132((byte)-37) * 635067323;
      var1.field_907 = var2.method_132((byte)-86) * -1949296963;
      int var6 = var2.method_130(-319941269);
      int var7;
      int var8;
      if(var6 > 0) {
         var1.field_908 = var1.method_1592(var6, 920031088);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.method_132((byte)-123);
            class_369 var13 = new class_369;
            var13.method_6590(var8 > 0?class_100.method_1845(var8, 1380797556):1);
            class_369 var9 = var13;
            var1.field_908[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.method_135((byte)-49);
               int var11 = var2.method_135((byte)-79);
               class_32 var10001 = new class_32;
               var10001.method_391(var11);
               var9.method_6588(var10001, (long)var10);
            }
         }
      }

      var2.field_15 = 0;
      var1.field_899 = var2.method_347(-1358924413);
      var1.field_903 = new int[var5];
      var1.field_902 = new int[var5];
      var1.field_910 = new String[var5];

      for(var7 = 0; var2.field_15 * -442398587 < var4; var1.field_903[var7++] = var8) {
         var8 = var2.method_132((byte)-81);
         if(var8 == 3) {
            var1.field_910[var7] = var2.method_139(-391631059);
         } else if(var8 < 100 && var8 != 21 && 38 != var8 && var8 != 39) {
            var1.field_902[var7] = var2.method_135((byte)-18);
         } else {
            var1.field_902[var7] = var2.method_130(-525121709);
         }
      }

      return var1;
   }

   // $FF: renamed from: o (byte[]) cf
   static class_90 method_1599(byte[] var0) {
      class_90 var10000 = new class_90;
      var10000.method_105();
      class_90 var1 = var10000;
      class_28 var12 = new class_28;
      var12.method_178(var0);
      class_28 var2 = var12;
      var2.field_15 = -1734081266 * (var2.field_12.length - 2);
      int var3 = var2.method_132((byte)-29);
      int var4 = var2.field_12.length - 2 - var3 - 12;
      var2.field_15 = var4 * -1025691571;
      int var5 = var2.method_135((byte)-84);
      var1.field_904 = var2.method_132((byte)-26) * -1493601504;
      var1.field_905 = var2.method_132((byte)-53) * -465592225;
      var1.field_906 = var2.method_132((byte)-111) * -1414636845;
      var1.field_907 = var2.method_132((byte)-72) * -1949296963;
      int var6 = var2.method_130(-1453078155);
      int var7;
      int var8;
      if(var6 > 0) {
         var1.field_908 = var1.method_1592(var6, 920031088);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.method_132((byte)-45);
            class_369 var13 = new class_369;
            var13.method_6590(var8 > 0?class_100.method_1845(var8, -1880995108):1);
            class_369 var9 = var13;
            var1.field_908[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.method_135((byte)-93);
               int var11 = var2.method_135((byte)-12);
               class_32 var10001 = new class_32;
               var10001.method_391(var11);
               var9.method_6588(var10001, (long)var10);
            }
         }
      }

      var2.field_15 = 0;
      var1.field_899 = var2.method_347(-965780493);
      var1.field_903 = new int[var5];
      var1.field_902 = new int[var5];
      var1.field_910 = new String[var5];

      for(var7 = 0; var2.field_15 * -442398587 < var4; var1.field_903[var7++] = var8) {
         var8 = var2.method_132((byte)-37);
         if(var8 == 3) {
            var1.field_910[var7] = var2.method_139(-391631059);
         } else if(var8 < 2085135687 && var8 != 21 && 511599521 != var8 && var8 != 39) {
            var1.field_902[var7] = var2.method_135((byte)-31);
         } else {
            var1.field_902[var7] = var2.method_130(-929880848);
         }
      }

      return var1;
   }

   // $FF: renamed from: c (byte[]) cf
   static class_90 method_1600(byte[] var0) {
      class_90 var10000 = new class_90;
      var10000.method_105();
      class_90 var1 = var10000;
      class_28 var12 = new class_28;
      var12.method_178(var0);
      class_28 var2 = var12;
      var2.field_15 = -1025691571 * (var2.field_12.length - 2);
      int var3 = var2.method_132((byte)-28);
      int var4 = var2.field_12.length - 2 - var3 - 12;
      var2.field_15 = var4 * -1025691571;
      int var5 = var2.method_135((byte)-109);
      var1.field_904 = var2.method_132((byte)-35) * -341761097;
      var1.field_905 = var2.method_132((byte)-14) * -465592225;
      var1.field_906 = var2.method_132((byte)-37) * 635067323;
      var1.field_907 = var2.method_132((byte)-58) * -1949296963;
      int var6 = var2.method_130(1985649133);
      int var7;
      int var8;
      if(var6 > 0) {
         var1.field_908 = var1.method_1592(var6, 920031088);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.method_132((byte)-10);
            class_369 var13 = new class_369;
            var13.method_6590(var8 > 0?class_100.method_1845(var8, -511155575):1);
            class_369 var9 = var13;
            var1.field_908[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.method_135((byte)-15);
               int var11 = var2.method_135((byte)-20);
               class_32 var10001 = new class_32;
               var10001.method_391(var11);
               var9.method_6588(var10001, (long)var10);
            }
         }
      }

      var2.field_15 = 0;
      var1.field_899 = var2.method_347(100285922);
      var1.field_903 = new int[var5];
      var1.field_902 = new int[var5];
      var1.field_910 = new String[var5];

      for(var7 = 0; var2.field_15 * -442398587 < var4; var1.field_903[var7++] = var8) {
         var8 = var2.method_132((byte)-57);
         if(var8 == 3) {
            var1.field_910[var7] = var2.method_139(-391631059);
         } else if(var8 < 100 && var8 != 21 && 38 != var8 && var8 != 39) {
            var1.field_902[var7] = var2.method_135((byte)-100);
         } else {
            var1.field_902[var7] = var2.method_130(2083507740);
         }
      }

      return var1;
   }

   // $FF: renamed from: f (boolean, boolean, int) op
   static class_66 method_1601(boolean var0, boolean var1, int var2) {
      try {
         class_66 var10000;
         if(var0) {
            if(var1) {
               if(var2 >= -472713491) {
                  throw new IllegalStateException();
               }

               var10000 = class_44.field_323;
            } else {
               var10000 = class_312.field_3759;
            }
         } else if(var1) {
            if(var2 >= -472713491) {
               throw new IllegalStateException();
            }

            var10000 = class_148.field_1876;
         } else {
            var10000 = class_160.field_2001;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "cf.f(" + ')');
      }
   }

   // $FF: renamed from: f (java.lang.String, int, java.lang.String, int) boolean
   static boolean method_1602(String var0, int var1, String var2, int var3) {
      try {
         if(var1 == 0) {
            if(var3 == -2068329395) {
               throw new IllegalStateException();
            } else {
               try {
                  if(!class_136.field_1751.startsWith("win")) {
                     if(var3 == -2068329395) {
                        throw new IllegalStateException();
                     } else {
                        throw new Exception();
                     }
                  } else {
                     if(!var0.startsWith("http://")) {
                        if(var3 == -2068329395) {
                           throw new IllegalStateException();
                        }

                        if(!var0.startsWith("https://")) {
                           if(var3 == -2068329395) {
                              throw new IllegalStateException();
                           }

                           throw new Exception();
                        }
                     }

                     String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                     for(int var5 = 0; var5 < var0.length(); ++var5) {
                        if(var3 == -2068329395) {
                           throw new IllegalStateException();
                        }

                        if(var12.indexOf(var0.charAt(var5)) == -1) {
                           if(var3 == -2068329395) {
                              throw new IllegalStateException();
                           }

                           throw new Exception();
                        }
                     }

                     Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
                     return true;
                  }
               } catch (Throwable var6) {
                  return false;
               }
            }
         } else if(var1 == 1) {
            if(var3 == -2068329395) {
               throw new IllegalStateException();
            } else {
               try {
                  Object var4 = class_129.method_2854(class_136.field_1755, var2, new Object[]{(new URL(class_136.field_1755.getCodeBase(), var0)).toString()}, (short)-19478);
                  boolean var10000;
                  if(var4 != null) {
                     if(var3 == -2068329395) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  return var10000;
               } catch (Throwable var7) {
                  return false;
               }
            }
         } else if(2 == var1) {
            if(var3 == -2068329395) {
               throw new IllegalStateException();
            } else {
               try {
                  class_136.field_1755.getAppletContext().showDocument(new URL(class_136.field_1755.getCodeBase(), var0), "_blank");
                  return true;
               } catch (Exception var8) {
                  return false;
               }
            }
         } else if(3 == var1) {
            if(var3 == -2068329395) {
               throw new IllegalStateException();
            } else {
               try {
                  class_129.method_2853(class_136.field_1755, "loggedout", 901657187);
               } catch (Throwable var10) {
                  ;
               }

               try {
                  class_136.field_1755.getAppletContext().showDocument(new URL(class_136.field_1755.getCodeBase(), var0), "_top");
                  return true;
               } catch (Exception var9) {
                  return false;
               }
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "cf.f(" + ')');
      }
   }

   // $FF: renamed from: iq (int, int, int, int, java.lang.String, java.lang.String, int, int, int) void
   static final void method_1603(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7, int var8) {
      try {
         if(var2 >= 2000) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var2 -= 2000;
         }

         class_40 var9;
         if(37 == var2) {
            if(var8 == 594496727) {
               return;
            }

            var9 = class_112.method_2238(class_266.field_3147, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_194(var1, -827760898);
            var9.field_263.method_167(var0, (byte)-17);
            var9.field_263.method_333(var3, -1554851381);
            client.field_1463.method_4079(var9, -1944995877);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1, 1019194269);
            client.field_1617 = -315663137 * var0;
         }

         byte var10001;
         if(var2 == 16) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = 560058203 * var6;
            client.field_1519 = var7 * 246678685;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = 819547401 * var0;
            client.field_1562 = var1 * 1551872625;
            var9 = class_112.method_2238(class_266.field_3051, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_165(class_178.field_2220 * 81340013, 1659882221);
            var9.field_263.method_185(var3, -2132735971);
            var9.field_263.method_165(class_189.field_2276 * 1854633345, 1409720061);
            var9.field_263.method_167(class_154.field_1929 * -27903763 + var1, (byte)25);
            var9.field_263.method_165(class_243.field_2700 * 697161691 + var0, 1277787777);
            var9.field_263.method_177(class_100.field_1172 * 1565845213, (byte)-12);
            if(class_145.field_1840[82]) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var9.field_263.method_148(var10001, -293793568);
            client.field_1463.method_4079(var9, -1687258572);
         }

         class_40 var10;
         class_100 var13;
         if(var2 == 47) {
            var13 = client.field_1605[var3];
            if(null != var13) {
               if(var8 == 594496727) {
                  return;
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = 819547401 * var0;
               client.field_1562 = var1 * 1551872625;
               var10 = class_112.method_2238(class_266.field_3079, client.field_1463.field_2384, (byte)8);
               var10.field_263.method_185(var3, -1984958105);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.field_263.method_148(var10001, -1876446081);
               client.field_1463.method_4079(var10, -1841874517);
            }
         }

         class_37 var14;
         if(var2 == 58) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var14 = class_325.method_5779(var1, var0, -594011323);
            if(var14 != null) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var10 = class_112.method_2238(class_266.field_3072, client.field_1463.field_2384, (byte)8);
               var10.field_263.method_194(var1, -655518659);
               var10.field_263.method_185(539336237 * var14.field_229, -2036420551);
               var10.field_263.method_165(client.field_1564 * 1424616685, 1334614809);
               var10.field_263.method_116(class_148.field_1875 * 1430642749, 734784849);
               var10.field_263.method_185(1683168531 * client.field_1573, -2116188971);
               var10.field_263.method_165(var0, 1248238288);
               client.field_1463.method_4079(var10, -1722519522);
            }
         }

         class_99 var15;
         if(var2 == 13) {
            var15 = client.field_1458[var3];
            if(var15 != null) {
               if(var8 == 594496727) {
                  return;
               }

               client.field_1567 = var6 * 560058203;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = 819547401 * var0;
               client.field_1562 = 1551872625 * var1;
               var10 = class_112.method_2238(class_266.field_3099, client.field_1463.field_2384, (byte)8);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     return;
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.field_263.method_158(var10001, 548537930);
               var10.field_263.method_167(var3, (byte)-61);
               client.field_1463.method_4079(var10, -1664786299);
            }
         }

         int var11;
         class_37 var16;
         if(28 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var9 = class_112.method_2238(class_266.field_3093, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_116(var1, -316431659);
            client.field_1463.method_4079(var9, -1754336555);
            var16 = class_71.method_1047(var1, 1844316862);
            if(var16.field_221 != null) {
               if(var8 == 594496727) {
                  return;
               }

               if(var16.field_221[0][0] == 5) {
                  if(var8 == 594496727) {
                     return;
                  }

                  var11 = var16.field_221[0][1];
                  class_282.field_3246[var11] = 1 - class_282.field_3246[var11];
                  class_147.method_3111(var11, -2096106350);
               }
            }
         }

         if(var2 == 43) {
            if(var8 == 594496727) {
               return;
            }

            var9 = class_112.method_2238(class_266.field_3107, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_185(var3, -2144848706);
            var9.field_263.method_167(var0, (byte)-2);
            var9.field_263.method_176(var1, -126089348);
            client.field_1463.method_4079(var9, -1984564859);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1, 1163679477);
            client.field_1617 = var0 * -315663137;
         }

         if(34 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var9 = class_112.method_2238(class_266.field_3050, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_194(var1, -1923707381);
            var9.field_263.method_165(var0, 2102057245);
            var9.field_263.method_165(var3, 1857724918);
            client.field_1463.method_4079(var9, -1921207646);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1, 15020092);
            client.field_1617 = -315663137 * var0;
         }

         if(8 == var2) {
            var15 = client.field_1458[var3];
            if(var15 != null) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = 246678685 * var7;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = 819547401 * var0;
               client.field_1562 = 1551872625 * var1;
               var10 = class_112.method_2238(class_266.field_3073, client.field_1463.field_2384, (byte)8);
               var10.field_263.method_177(1430642749 * class_148.field_1875, (byte)-11);
               var10.field_263.method_165(1424616685 * client.field_1564, 1645721192);
               var10.field_263.method_165(var3, 1294248582);
               var10.field_263.method_333(1683168531 * client.field_1573, 1557085242);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.field_263.method_158(var10001, -1147421718);
               client.field_1463.method_4079(var10, -2115512194);
            }
         }

         if(var2 == 1002) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = 560058203 * var6;
            client.field_1519 = 246678685 * var7;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            var9 = class_112.method_2238(class_266.field_3065, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_165(var3, 1825711900);
            client.field_1463.method_4079(var9, -1949684295);
         }

         if(42 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var9 = class_112.method_2238(class_266.field_3109, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_177(var1, (byte)-19);
            var9.field_263.method_333(var3, -847395142);
            var9.field_263.method_185(var0, -2081388119);
            client.field_1463.method_4079(var9, -2065742485);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1, 435575325);
            client.field_1617 = -315663137 * var0;
         }

         if(var2 == 31) {
            if(var8 == 594496727) {
               return;
            }

            var9 = class_112.method_2238(class_266.field_3105, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_116(var1, -1619456867);
            var9.field_263.method_194(1565845213 * class_100.field_1172, -1192491289);
            var9.field_263.method_185(var0, -2018235743);
            var9.field_263.method_333(var3, -20241793);
            var9.field_263.method_167(81340013 * class_178.field_2220, (byte)-75);
            var9.field_263.method_167(class_189.field_2276 * 1854633345, (byte)-12);
            client.field_1463.method_4079(var9, -1880241302);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1, 1431646683);
            client.field_1617 = -315663137 * var0;
         }

         if(var2 == 5) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = 560058203 * var6;
            client.field_1519 = 246678685 * var7;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = var0 * 819547401;
            client.field_1562 = 1551872625 * var1;
            var9 = class_112.method_2238(class_266.field_3146, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_165(var0 + 697161691 * class_243.field_2700, 1796765334);
            var9.field_263.method_167(-27903763 * class_154.field_1929 + var1, (byte)-36);
            var9.field_263.method_145(class_145.field_1840[82]?1:0, (byte)31);
            var9.field_263.method_185(var3, -1972964524);
            client.field_1463.method_4079(var9, -2130405147);
         }

         if(var2 == 41) {
            if(var8 == 594496727) {
               return;
            }

            var9 = class_112.method_2238(class_266.field_3113, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_165(var3, 1951024789);
            var9.field_263.method_185(var0, -2110661352);
            var9.field_263.method_194(var1, -945648970);
            client.field_1463.method_4079(var9, -2123525821);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1, 1361622457);
            client.field_1617 = -315663137 * var0;
         }

         if(32 == var2) {
            if(var8 == 594496727) {
               return;
            }

            var9 = class_112.method_2238(class_266.field_3083, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_177(1430642749 * class_148.field_1875, (byte)-112);
            var9.field_263.method_185(1683168531 * client.field_1573, -2009778565);
            var9.field_263.method_177(var1, (byte)-70);
            var9.field_263.method_165(var3, 1933786013);
            var9.field_263.method_185(var0, -2081862487);
            client.field_1463.method_4079(var9, -2036350482);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1, 1236579995);
            client.field_1617 = -315663137 * var0;
         }

         if(21 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = 560058203 * var6;
            client.field_1519 = 246678685 * var7;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = 819547401 * var0;
            client.field_1562 = var1 * 1551872625;
            var9 = class_112.method_2238(class_266.field_3049, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_167(var3, (byte)45);
            var9.field_263.method_333(class_154.field_1929 * -27903763 + var1, -329811947);
            if(class_145.field_1840[82]) {
               if(var8 == 594496727) {
                  return;
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var9.field_263.method_145(var10001, (byte)-11);
            var9.field_263.method_333(var0 + class_243.field_2700 * 697161691, 771339063);
            client.field_1463.method_4079(var9, -1906831512);
         }

         if(30 == var2) {
            if(var8 == 594496727) {
               return;
            }

            if(null == client.field_1583) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               class_115.method_2243(var1, var0, 188298202);
               client.field_1583 = class_325.method_5779(var1, var0, 985076194);
               class_254.method_4900(client.field_1583, (byte)96);
            }
         }

         if(18 == var2) {
            if(var8 == 594496727) {
               return;
            }

            client.field_1567 = 560058203 * var6;
            client.field_1519 = var7 * 246678685;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = var0 * 819547401;
            client.field_1562 = 1551872625 * var1;
            var9 = class_112.method_2238(class_266.field_3140, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_333(var3, -605259701);
            var9.field_263.method_148(class_145.field_1840[82]?1:0, 1344306662);
            var9.field_263.method_167(-27903763 * class_154.field_1929 + var1, (byte)-71);
            var9.field_263.method_333(697161691 * class_243.field_2700 + var0, 579208387);
            client.field_1463.method_4079(var9, -1807890225);
         }

         if(36 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var9 = class_112.method_2238(class_266.field_3135, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_176(var1, -1833002608);
            var9.field_263.method_165(var3, 1930281738);
            var9.field_263.method_167(var0, (byte)-57);
            client.field_1463.method_4079(var9, -1905719754);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1, 1663293304);
            client.field_1617 = var0 * -315663137;
         }

         if(var2 == 3) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = var6 * 560058203;
            client.field_1519 = 246678685 * var7;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = var0 * 819547401;
            client.field_1562 = var1 * 1551872625;
            var9 = class_112.method_2238(class_266.field_3115, client.field_1463.field_2384, (byte)8);
            if(class_145.field_1840[82]) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var9.field_263.method_158(var10001, -1056477772);
            var9.field_263.method_167(var3, (byte)-55);
            var9.field_263.method_333(697161691 * class_243.field_2700 + var0, 1654040671);
            var9.field_263.method_165(var1 + class_154.field_1929 * -27903763, 1364954563);
            client.field_1463.method_4079(var9, -1990075316);
         }

         if(var2 == 4) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = var6 * 560058203;
            client.field_1519 = var7 * 246678685;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = var0 * 819547401;
            client.field_1562 = var1 * 1551872625;
            var9 = class_112.method_2238(class_266.field_3100, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_333(class_243.field_2700 * 697161691 + var0, 1872069276);
            var9.field_263.method_167(var3, (byte)49);
            if(class_145.field_1840[82]) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var9.field_263.method_145(var10001, (byte)38);
            var9.field_263.method_167(-27903763 * class_154.field_1929 + var1, (byte)-29);
            client.field_1463.method_4079(var9, -1818993718);
         }

         if(14 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var13 = client.field_1605[var3];
            if(null != var13) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = 246678685 * var7;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = 819547401 * var0;
               client.field_1562 = 1551872625 * var1;
               var10 = class_112.method_2238(class_266.field_3097, client.field_1463.field_2384, (byte)8);
               var10.field_263.method_194(class_100.field_1172 * 1565845213, -792593785);
               var10.field_263.method_185(class_189.field_2276 * 1854633345, -2094387271);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.field_263.method_145(var10001, (byte)11);
               var10.field_263.method_185(81340013 * class_178.field_2220, -1986905376);
               var10.field_263.method_333(var3, -1383074759);
               client.field_1463.method_4079(var10, -1829094983);
            }
         }

         if(var2 == 17) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = var6 * 560058203;
            client.field_1519 = 246678685 * var7;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = 819547401 * var0;
            client.field_1562 = var1 * 1551872625;
            var9 = class_112.method_2238(class_266.field_3142, client.field_1463.field_2384, (byte)8);
            if(class_145.field_1840[82]) {
               if(var8 == 594496727) {
                  return;
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var9.field_263.method_145(var10001, (byte)-16);
            var9.field_263.method_176(1430642749 * class_148.field_1875, -1381979351);
            var9.field_263.method_165(class_154.field_1929 * -27903763 + var1, 1924281999);
            var9.field_263.method_167(1424616685 * client.field_1564, (byte)-32);
            var9.field_263.method_185(var3, -2053017873);
            var9.field_263.method_333(var0 + class_243.field_2700 * 697161691, -1266744787);
            var9.field_263.method_165(1683168531 * client.field_1573, 1810438296);
            client.field_1463.method_4079(var9, -1861999821);
         }

         if(var2 == 49) {
            if(var8 == 594496727) {
               return;
            }

            var13 = client.field_1605[var3];
            if(null != var13) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = var0 * 819547401;
               client.field_1562 = 1551872625 * var1;
               var10 = class_112.method_2238(class_266.field_3110, client.field_1463.field_2384, (byte)8);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.field_263.method_145(var10001, (byte)-44);
               var10.field_263.method_167(var3, (byte)64);
               client.field_1463.method_4079(var10, -1795174810);
            }
         }

         label1258: {
            if(57 != var2) {
               if(var8 == 594496727) {
                  return;
               }

               if(var2 != 1007) {
                  break label1258;
               }

               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }
            }

            var14 = class_325.method_5779(var1, var0, -283841402);
            if(null != var14) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               class_382.method_6682(var3, var1, var0, var14.field_229 * 539336237, var5, -537904006);
            }
         }

         if(var2 == 1001) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = var6 * 560058203;
            client.field_1519 = var7 * 246678685;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = 819547401 * var0;
            client.field_1562 = 1551872625 * var1;
            var9 = class_112.method_2238(class_266.field_3114, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_167(var0 + 697161691 * class_243.field_2700, (byte)53);
            var9.field_263.method_158(class_145.field_1840[82]?1:0, 427991620);
            var9.field_263.method_333(var3, 895089656);
            var9.field_263.method_167(-27903763 * class_154.field_1929 + var1, (byte)59);
            client.field_1463.method_4079(var9, -1987047958);
         }

         if(var2 == 1) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = 560058203 * var6;
            client.field_1519 = 246678685 * var7;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = var0 * 819547401;
            client.field_1562 = 1551872625 * var1;
            var9 = class_112.method_2238(class_266.field_3151, client.field_1463.field_2384, (byte)8);
            var9.field_263.method_185(1854633345 * class_189.field_2276, -1955728583);
            var9.field_263.method_167(var3, (byte)-2);
            var9.field_263.method_158(class_145.field_1840[82]?1:0, 440690601);
            var9.field_263.method_167(class_154.field_1929 * -27903763 + var1, (byte)2);
            var9.field_263.method_116(class_100.field_1172 * 1565845213, 1056056825);
            var9.field_263.method_167(var0 + 697161691 * class_243.field_2700, (byte)61);
            var9.field_263.method_333(class_178.field_2220 * 81340013, 367809691);
            client.field_1463.method_4079(var9, -2085988754);
         }

         if(23 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            if(client.field_1553) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               class_206.field_2401.method_4841();
            } else {
               class_206.field_2401.method_4755(class_115.field_1289 * 1115122599, var0, var1, true);
            }
         }

         if(46 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var13 = client.field_1605[var3];
            if(var13 != null) {
               client.field_1567 = 560058203 * var6;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = var0 * 819547401;
               client.field_1562 = var1 * 1551872625;
               var10 = class_112.method_2238(class_266.field_3111, client.field_1463.field_2384, (byte)8);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.field_263.method_148(var10001, 1140364808);
               var10.field_263.method_333(var3, -1439366597);
               client.field_1463.method_4079(var10, -2045274510);
            }
         }

         if(var2 == 48) {
            var13 = client.field_1605[var3];
            if(null != var13) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = var6 * 560058203;
               client.field_1519 = 246678685 * var7;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = 819547401 * var0;
               client.field_1562 = var1 * 1551872625;
               var10 = class_112.method_2238(class_266.field_3076, client.field_1463.field_2384, (byte)8);
               var10.field_263.method_167(var3, (byte)37);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.field_263.method_210(var10001, 303066737);
               client.field_1463.method_4079(var10, -1735035915);
            }
         }

         if(var2 == 38) {
            if(var8 != 594496727) {
               class_54.method_583(-1850055815);
               var14 = class_71.method_1047(var1, 298683045);
               client.field_1570 = -302428595;
               class_178.field_2220 = 1632162661 * var0;
               class_100.field_1172 = var1 * 1093673333;
               class_189.field_2276 = var3 * 1443023489;
               class_254.method_4900(var14, (byte)36);
               client.field_1571 = class_136.method_2958(16748608, -1966582053) + class_299.method_5347(var3, -186522708).field_707 + class_136.method_2958(16777215, -1966582053);
               if(null == client.field_1571) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1571 = class_305.field_3410;
               }

            }
         } else {
            if(var2 == 45) {
               if(var8 == 594496727) {
                  return;
               }

               var13 = client.field_1605[var3];
               if(var13 != null) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1567 = var6 * 560058203;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = var0 * 819547401;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.method_2238(class_266.field_3128, client.field_1463.field_2384, (byte)8);
                  var10.field_263.method_165(var3, 1592081025);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        return;
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.field_263.method_210(var10001, 303066737);
                  client.field_1463.method_4079(var10, -2140837767);
               }
            }

            if(50 == var2) {
               if(var8 == 594496727) {
                  return;
               }

               var13 = client.field_1605[var3];
               if(var13 != null) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1567 = var6 * 560058203;
                  client.field_1519 = var7 * 246678685;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = var0 * 819547401;
                  client.field_1562 = 1551872625 * var1;
                  var10 = class_112.method_2238(class_266.field_3094, client.field_1463.field_2384, (byte)8);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.field_263.method_210(var10001, 303066737);
                  var10.field_263.method_167(var3, (byte)20);
                  client.field_1463.method_4079(var10, -1660813326);
               }
            }

            if(1004 == var2) {
               client.field_1567 = var6 * 560058203;
               client.field_1519 = 246678685 * var7;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               var9 = class_112.method_2238(class_266.field_3120, client.field_1463.field_2384, (byte)8);
               var9.field_263.method_165(var3, 1856779596);
               client.field_1463.method_4079(var9, -1809082149);
            }

            if(var2 == 44) {
               if(var8 == 594496727) {
                  return;
               }

               var13 = client.field_1605[var3];
               if(null != var13) {
                  client.field_1567 = 560058203 * var6;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = 819547401 * var0;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.method_2238(class_266.field_3071, client.field_1463.field_2384, (byte)8);
                  var10.field_263.method_185(var3, -1979010033);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.field_263.method_148(var10001, 1128265145);
                  client.field_1463.method_4079(var10, -1951418068);
               }
            }

            if(var2 == 9) {
               if(var8 == 594496727) {
                  return;
               }

               var15 = client.field_1458[var3];
               if(null != var15) {
                  if(var8 == 594496727) {
                     return;
                  }

                  client.field_1567 = 560058203 * var6;
                  client.field_1519 = var7 * 246678685;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = var0 * 819547401;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.method_2238(class_266.field_3098, client.field_1463.field_2384, (byte)8);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.field_263.method_145(var10001, (byte)-19);
                  var10.field_263.method_165(var3, 1470929586);
                  client.field_1463.method_4079(var10, -1909215804);
               }
            }

            if(7 == var2) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var15 = client.field_1458[var3];
               if(var15 != null) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1567 = var6 * 560058203;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = 819547401 * var0;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.method_2238(class_266.field_3149, client.field_1463.field_2384, (byte)8);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.field_263.method_210(var10001, 303066737);
                  var10.field_263.method_167(class_189.field_2276 * 1854633345, (byte)13);
                  var10.field_263.method_177(class_100.field_1172 * 1565845213, (byte)5);
                  var10.field_263.method_185(var3, -1998132382);
                  var10.field_263.method_165(class_178.field_2220 * 81340013, 1982017170);
                  client.field_1463.method_4079(var10, -1890244035);
               }
            }

            if(var2 == 29) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var9 = class_112.method_2238(class_266.field_3093, client.field_1463.field_2384, (byte)8);
               var9.field_263.method_116(var1, -67249160);
               client.field_1463.method_4079(var9, -1693897283);
               var16 = class_71.method_1047(var1, 181373046);
               if(null != var16.field_221) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  if(var16.field_221[0][0] == 5) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var11 = var16.field_221[0][1];
                     if(class_282.field_3246[var11] != var16.field_193[0]) {
                        if(var8 == 594496727) {
                           return;
                        }

                        class_282.field_3246[var11] = var16.field_193[0];
                        class_147.method_3111(var11, 1343156816);
                     }
                  }
               }
            }

            class_40 var17;
            if(var2 == 1003) {
               client.field_1567 = 560058203 * var6;
               client.field_1519 = 246678685 * var7;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               var15 = client.field_1458[var3];
               if(null != var15) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  class_88 var18 = var15.field_1141;
                  if(var18.field_862 != null) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var18 = var18.method_1545((byte)5);
                  }

                  if(null != var18) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var17 = class_112.method_2238(class_266.field_3052, client.field_1463.field_2384, (byte)8);
                     var17.field_263.method_165(var18.field_857 * -2060838679, 1707069268);
                     client.field_1463.method_4079(var17, -1727659840);
                  }
               }
            }

            if(6 == var2) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = var0 * 819547401;
               client.field_1562 = 1551872625 * var1;
               var9 = class_112.method_2238(class_266.field_3046, client.field_1463.field_2384, (byte)8);
               var9.field_263.method_185(var3, -2130731126);
               var9.field_263.method_185(var1 + -27903763 * class_154.field_1929, -1972814051);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var9.field_263.method_145(var10001, (byte)1);
               var9.field_263.method_167(class_243.field_2700 * 697161691 + var0, (byte)-50);
               client.field_1463.method_4079(var9, -1847077943);
            }

            if(var2 == 12) {
               var15 = client.field_1458[var3];
               if(null != var15) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1567 = var6 * 560058203;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = var0 * 819547401;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.method_2238(class_266.field_3075, client.field_1463.field_2384, (byte)8);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        return;
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.field_263.method_210(var10001, 303066737);
                  var10.field_263.method_185(var3, -1958539634);
                  client.field_1463.method_4079(var10, -1778161609);
               }
            }

            if(var2 == 2) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = var0 * 819547401;
               client.field_1562 = 1551872625 * var1;
               var9 = class_112.method_2238(class_266.field_3117, client.field_1463.field_2384, (byte)8);
               var9.field_263.method_165(var0 + class_243.field_2700 * 697161691, 1201481060);
               var9.field_263.method_333(var3, 2112955800);
               var9.field_263.method_165(client.field_1564 * 1424616685, 1393145974);
               var9.field_263.method_333(class_154.field_1929 * -27903763 + var1, -264933509);
               var9.field_263.method_333(client.field_1573 * 1683168531, 1442772789);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     return;
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var9.field_263.method_158(var10001, 929360639);
               var9.field_263.method_177(class_148.field_1875 * 1430642749, (byte)-117);
               client.field_1463.method_4079(var9, -1689730758);
            }

            if(26 == var2) {
               if(var8 == 594496727) {
                  return;
               }

               class_117.method_2250((short)-23226);
            }

            label1224: {
               if(1008 != var2) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  if(1009 != var2) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     if(var2 != 1010 && var2 != 1011) {
                        if(var2 != 1012) {
                           break label1224;
                        }

                        if(var8 == 594496727) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               class_363 var10000 = class_287.field_3278;
               class_280 var10003 = new class_280;
               var10003.method_5163(var0);
               class_280 var10004 = new class_280;
               var10004.method_5163(var1);
               var10000.method_6383(var2, var3, var10003, var10004, 1568785181);
            }

            if(var2 == 11) {
               var15 = client.field_1458[var3];
               if(null != var15) {
                  client.field_1567 = var6 * 560058203;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = 819547401 * var0;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.method_2238(class_266.field_3092, client.field_1463.field_2384, (byte)8);
                  var10.field_263.method_165(var3, 1982151113);
                  var10.field_263.method_210(class_145.field_1840[82]?1:0, 303066737);
                  client.field_1463.method_4079(var10, -1772838450);
               }
            }

            if(var2 == 24) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var14 = class_71.method_1047(var1, 1630956674);
               boolean var19 = true;
               if(-1245218361 * var14.field_207 > 0) {
                  var19 = class_72.method_1091(var14, 376048815);
               }

               if(var19) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var17 = class_112.method_2238(class_266.field_3093, client.field_1463.field_2384, (byte)8);
                  var17.field_263.method_116(var1, 1608370500);
                  client.field_1463.method_4079(var17, -1668745492);
               }
            }

            if(var2 == 22) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = 819547401 * var0;
               client.field_1562 = 1551872625 * var1;
               var9 = class_112.method_2238(class_266.field_3123, client.field_1463.field_2384, (byte)8);
               var9.field_263.method_167(var3, (byte)-70);
               var9.field_263.method_185(697161691 * class_243.field_2700 + var0, -2074176882);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var9.field_263.method_158(var10001, -1975094958);
               var9.field_263.method_185(var1 + -27903763 * class_154.field_1929, -2082447847);
               client.field_1463.method_4079(var9, -1921746612);
            }

            if(39 == var2) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var9 = class_112.method_2238(class_266.field_3055, client.field_1463.field_2384, (byte)8);
               var9.field_263.method_167(var0, (byte)-51);
               var9.field_263.method_165(var3, 1964928005);
               var9.field_263.method_176(var1, -1643392378);
               client.field_1463.method_4079(var9, -1815027869);
               client.field_1523 = 0;
               class_303.field_3395 = class_71.method_1047(var1, 2107934714);
               client.field_1617 = -315663137 * var0;
            }

            if(35 == var2) {
               var9 = class_112.method_2238(class_266.field_3101, client.field_1463.field_2384, (byte)8);
               var9.field_263.method_333(var3, -1708377515);
               var9.field_263.method_177(var1, (byte)-108);
               var9.field_263.method_167(var0, (byte)-42);
               client.field_1463.method_4079(var9, -1893065067);
               client.field_1523 = 0;
               class_303.field_3395 = class_71.method_1047(var1, 1733509966);
               client.field_1617 = -315663137 * var0;
            }

            if(var2 == 15) {
               var13 = client.field_1605[var3];
               if(var13 != null) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1567 = var6 * 560058203;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = 819547401 * var0;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.method_2238(class_266.field_3089, client.field_1463.field_2384, (byte)8);
                  var10.field_263.method_185(client.field_1573 * 1683168531, -2099039050);
                  var10.field_263.method_167(var3, (byte)-61);
                  var10.field_263.method_176(1430642749 * class_148.field_1875, -73035191);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.field_263.method_148(var10001, -824786850);
                  var10.field_263.method_167(client.field_1564 * 1424616685, (byte)-87);
                  client.field_1463.method_4079(var10, -1888191216);
               }
            }

            if(20 == var2) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = var6 * 560058203;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = var0 * 819547401;
               client.field_1562 = 1551872625 * var1;
               var9 = class_112.method_2238(class_266.field_3150, client.field_1463.field_2384, (byte)8);
               var9.field_263.method_185(var3, -1958727482);
               var9.field_263.method_165(var0 + class_243.field_2700 * 697161691, 1962443834);
               var9.field_263.method_148(class_145.field_1840[82]?1:0, 1770402223);
               var9.field_263.method_167(var1 + class_154.field_1929 * -27903763, (byte)18);
               client.field_1463.method_4079(var9, -1720041530);
            }

            if(51 == var2) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var13 = client.field_1605[var3];
               if(var13 != null) {
                  if(var8 == 594496727) {
                     return;
                  }

                  client.field_1567 = 560058203 * var6;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = 819547401 * var0;
                  client.field_1562 = 1551872625 * var1;
                  var10 = class_112.method_2238(class_266.field_3130, client.field_1463.field_2384, (byte)8);
                  var10.field_263.method_333(var3, 1649085103);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.field_263.method_158(var10001, -577993733);
                  client.field_1463.method_4079(var10, -1960002087);
               }
            }

            if(25 == var2) {
               if(var8 != 594496727) {
                  var14 = class_325.method_5779(var1, var0, 182699028);
                  if(null != var14) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     class_54.method_583(1129864737);
                     class_162.method_3415(var1, var0, class_196.method_3989(class_112.method_2236(var14, 2136074538), (byte)-114), 539336237 * var14.field_229, -2141700582);
                     client.field_1570 = 0;
                     client.field_1575 = class_269.method_5039(var14, -502869844);
                     if(client.field_1575 == null) {
                        if(var8 == 594496727) {
                           throw new IllegalStateException();
                        }

                        client.field_1575 = class_305.field_3410;
                     }

                     if(var14.field_100) {
                        if(var8 == 594496727) {
                           throw new IllegalStateException();
                        }

                        client.field_1545 = var14.field_91 + class_136.method_2958(16777215, -1966582053);
                     } else {
                        client.field_1545 = class_136.method_2958('\uff00', -1966582053) + var14.field_225 + class_136.method_2958(16777215, -1966582053);
                     }
                  }

               }
            } else {
               if(40 == var2) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var9 = class_112.method_2238(class_266.field_3053, client.field_1463.field_2384, (byte)8);
                  var9.field_263.method_165(var0, 1762817921);
                  var9.field_263.method_194(var1, -782535457);
                  var9.field_263.method_185(var3, -2135109374);
                  client.field_1463.method_4079(var9, -2025802743);
                  client.field_1523 = 0;
                  class_303.field_3395 = class_71.method_1047(var1, 1388291760);
                  client.field_1617 = var0 * -315663137;
               }

               if(var2 == 10) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var15 = client.field_1458[var3];
                  if(var15 != null) {
                     if(var8 == 594496727) {
                        return;
                     }

                     client.field_1567 = var6 * 560058203;
                     client.field_1519 = var7 * 246678685;
                     client.field_1521 = -1022456306;
                     client.field_1645 = 0;
                     client.field_1520 = var0 * 819547401;
                     client.field_1562 = var1 * 1551872625;
                     var10 = class_112.method_2238(class_266.field_3144, client.field_1463.field_2384, (byte)8);
                     var10.field_263.method_185(var3, -2090745216);
                     var10.field_263.method_145(class_145.field_1840[82]?1:0, (byte)-56);
                     client.field_1463.method_4079(var10, -1711326888);
                  }
               }

               if(var2 == 33) {
                  if(var8 == 594496727) {
                     return;
                  }

                  var9 = class_112.method_2238(class_266.field_3059, client.field_1463.field_2384, (byte)8);
                  var9.field_263.method_177(var1, (byte)8);
                  var9.field_263.method_165(var0, 1973328140);
                  var9.field_263.method_333(var3, 1871414489);
                  client.field_1463.method_4079(var9, -1749676991);
                  client.field_1523 = 0;
                  class_303.field_3395 = class_71.method_1047(var1, -20763678);
                  client.field_1617 = var0 * -315663137;
               }

               if(var2 == 1005) {
                  label1193: {
                     var14 = class_71.method_1047(var1, 518846261);
                     if(var14 != null) {
                        if(var8 == 594496727) {
                           throw new IllegalStateException();
                        }

                        if(var14.field_228[var0] >= 100000) {
                           if(var8 == 594496727) {
                              throw new IllegalStateException();
                           }

                           class_149.method_3135(27, "", var14.field_228[var0] + " x " + class_299.method_5347(var3, -124175090).field_707, -1832186219);
                           break label1193;
                        }
                     }

                     var10 = class_112.method_2238(class_266.field_3120, client.field_1463.field_2384, (byte)8);
                     var10.field_263.method_165(var3, 1611337503);
                     client.field_1463.method_4079(var10, -1695822918);
                  }

                  client.field_1523 = 0;
                  class_303.field_3395 = class_71.method_1047(var1, 788569861);
                  client.field_1617 = -315663137 * var0;
               }

               if(var2 == 19) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1567 = 560058203 * var6;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = 819547401 * var0;
                  client.field_1562 = 1551872625 * var1;
                  var9 = class_112.method_2238(class_266.field_3133, client.field_1463.field_2384, (byte)8);
                  var9.field_263.method_165(class_243.field_2700 * 697161691 + var0, 1575471949);
                  var9.field_263.method_167(-27903763 * class_154.field_1929 + var1, (byte)9);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var9.field_263.method_145(var10001, (byte)86);
                  var9.field_263.method_165(var3, 1264643474);
                  client.field_1463.method_4079(var9, -2089855783);
               }

               if(0 != -438265211 * client.field_1570) {
                  client.field_1570 = 0;
                  class_254.method_4900(class_71.method_1047(1565845213 * class_100.field_1172, 1497263479), (byte)85);
               }

               if(client.field_1572) {
                  if(var8 == 594496727) {
                     return;
                  }

                  class_54.method_583(980784572);
               }

               if(null != class_303.field_3395) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  if(0 == client.field_1523 * -1890193251) {
                     if(var8 == 594496727) {
                        return;
                     }

                     class_254.method_4900(class_303.field_3395, (byte)95);
                  }
               }

            }
         }
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12, "cf.iq(" + ')');
      }
   }

   // $FF: renamed from: r (int, int, boolean, byte) java.lang.String
   static String method_1604(int var0, int var1, boolean var2, byte var3) {
      try {
         if(var1 >= 2) {
            if(var3 >= -126) {
               throw new IllegalStateException();
            }

            if(var1 <= 36) {
               if(var2) {
                  if(var0 >= 0) {
                     int var4 = 2;

                     for(int var5 = var0 / var1; 0 != var5; ++var4) {
                        if(var3 >= -126) {
                           throw new IllegalStateException();
                        }

                        var5 /= var1;
                     }

                     char[] var6 = new char[var4];
                     var6[0] = 43;

                     for(int var7 = var4 - 1; var7 > 0; --var7) {
                        int var8 = var0;
                        var0 /= var1;
                        int var9 = var8 - var1 * var0;
                        if(var9 >= 10) {
                           if(var3 >= -126) {
                              throw new IllegalStateException();
                           }

                           var6[var7] = (char)(87 + var9);
                        } else {
                           var6[var7] = (char)(48 + var9);
                        }
                     }

                     return new String(var6);
                  }

                  if(var3 >= -126) {
                     throw new IllegalStateException();
                  }
               }

               return Integer.toString(var0, var1);
            }

            if(var3 >= -126) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10, "cf.r(" + ')');
      }
   }

   // $FF: renamed from: lv (int) void
   static void method_1605(int var0) {
      try {
         if(-400479567 * client.field_1660 == 1) {
            if(var0 <= 78996661) {
               throw new IllegalStateException();
            }

            client.field_1500 = true;
         }

      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cf.lv(" + ')');
      }
   }
}
