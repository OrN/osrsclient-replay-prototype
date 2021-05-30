
// $FF: renamed from: dn
public class class_186 extends class_181 {

    // $FF: renamed from: v boolean
   final boolean field_2264;


   // $FF: renamed from: u (int) void
   public static void method_3865() {
      try {
         class_76.field_627.method_5074();
         class_76.field_628.method_5074();
         class_76.field_629.method_5074();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

    public int compare(Object var1, Object var2) {
      try {
         return this.method_3874((class_339)var1, (class_339)var2, -26460885);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

    // $FF: renamed from: <init> (boolean) void
   public class_186(boolean var1) {
      super();
      try {
         this.field_2264 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: v (int, int) et
   public static class_77 method_3873(int var0, int var1) {
      try {
         class_77 var2 = (class_77)class_77.field_666.method_5065((long)var0);
         if(null != var2) {
            if(var1 == -2115685501) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class_77.field_654.method_5381(33, var0);
            class_77 var10000 = new class_77();
            var2 = var10000;
            if(var3 != null) {
               if(var1 == -2115685501) {
                  throw new IllegalStateException();
               }

               Buffer var10001 = new Buffer(var3);
               var2.method_1208(var10001, 1613150424);
            }

            class_77.field_666.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: v (lv, lv, int) int
   int method_3874(class_339 var1, class_339 var2, int var3) {
      try {
         if(1693720149 * var1.field_3888 != 0) {
            if(var3 != -26460885) {
               throw new IllegalStateException();
            }

            if(1693720149 * var2.field_3888 != 0) {
               if(var3 != -26460885) {
                  throw new IllegalStateException();
               }

               int var10000;
               if(this.field_2264) {
                  if(var3 != -26460885) {
                     throw new IllegalStateException();
                  }

                  var10000 = var1.method_5999().method_6275(var2.method_5999(), 1871505608);
               } else {
                  var10000 = var2.method_5999().method_6275(var1.method_5999(), 1020937883);
               }

               return var10000;
            }
         }

         return this.method_3830(var1, var2);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: p (java.lang.String, int) java.lang.Class
   static Class method_3875(String var0, int var1) throws ClassNotFoundException {
      try {
         if(var0.equals("B")) {
            if(var1 >= -1914726605) {
               throw new IllegalStateException();
            } else {
               return Byte.TYPE;
            }
         } else if(var0.equals("I")) {
            if(var1 >= -1914726605) {
               throw new IllegalStateException();
            } else {
               return Integer.TYPE;
            }
         } else if(var0.equals("S")) {
            if(var1 >= -1914726605) {
               throw new IllegalStateException();
            } else {
               return Short.TYPE;
            }
         } else if(var0.equals("J")) {
            if(var1 >= -1914726605) {
               throw new IllegalStateException();
            } else {
               return Long.TYPE;
            }
         } else if(var0.equals("Z")) {
            if(var1 >= -1914726605) {
               throw new IllegalStateException();
            } else {
               return Boolean.TYPE;
            }
         } else if(var0.equals("F")) {
            return Float.TYPE;
         } else if(var0.equals("D")) {
            if(var1 >= -1914726605) {
               throw new IllegalStateException();
            } else {
               return Double.TYPE;
            }
         } else if(var0.equals("C")) {
            if(var1 >= -1914726605) {
               throw new IllegalStateException();
            } else {
               return Character.TYPE;
            }
         } else {
            return var0.equals("void")?Void.TYPE:Class.forName(var0);
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: bn (byte[], int) byte[]
   static final byte[] method_3876(byte[] var0, int var1) {
      try {
         Buffer var10000 = new Buffer(var0);
         Buffer var2 = var10000;
         int var3 = var2.readUnsignedByte();
         int var4 = var2.method_135();
         if(var4 >= 0) {
            if(var1 <= 1225130098) {
               throw new IllegalStateException();
            } else {
               if(0 != 269464329 * class_306.field_3711) {
                  if(var1 <= 1225130098) {
                     throw new IllegalStateException();
                  }

                  if(var4 > class_306.field_3711 * 269464329) {
                     if(var1 <= 1225130098) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException();
                  }
               }

               if(0 == var3) {
                  if(var1 <= 1225130098) {
                     throw new IllegalStateException();
                  } else {
                     byte[] var8 = new byte[var4];
                     var2.method_267(var8, 0, var4, 1260377098);
                     return var8;
                  }
               } else {
                  int var5 = var2.method_135();
                  if(var5 >= 0) {
                     if(var1 <= 1225130098) {
                        throw new IllegalStateException();
                     } else {
                        if(269464329 * class_306.field_3711 != 0) {
                           if(var1 <= 1225130098) {
                              throw new IllegalStateException();
                           }

                           if(var5 > class_306.field_3711 * 269464329) {
                              throw new RuntimeException();
                           }
                        }

                        byte[] var6 = new byte[var5];
                        if(1 == var3) {
                           if(var1 <= 1225130098) {
                              throw new IllegalStateException();
                           }

                           class_389.method_6767(var6, var5, var0, 9);
                        } else {
                           class_306.field_3717.method_6794(var2, var6, (byte)48);
                        }

                        return var6;
                     }
                  } else {
                     throw new RuntimeException();
                  }
               }
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }
}
