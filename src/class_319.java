
// $FF: renamed from: ke
public class class_319 {

   // $FF: renamed from: r int[]
   static int[] field_3793;
   // $FF: renamed from: n int
   static int field_3794;
   // $FF: renamed from: f int
   static int field_3795;
   // $FF: renamed from: y byte[][]
   static byte[][] field_3796;
   // $FF: renamed from: p byte[][]
   static byte[][] field_3797;
   // $FF: renamed from: j byte[][]
   static byte[][] field_3798;
   // $FF: renamed from: v int
   static int field_3799;
   // $FF: renamed from: b int[]
   static int[] field_3800;


   // $FF: renamed from: n (java.lang.Object, boolean, byte) byte[]
   public static byte[] method_5659(Object var0, boolean var1, byte var2) {
      try {
         if(null == var0) {
            if(var2 == 14) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if(var0 instanceof byte[]) {
            if(var2 == 14) {
               throw new IllegalStateException();
            } else {
               byte[] var8 = (byte[])((byte[])var0);
               if(var1) {
                  if(var2 == 14) {
                     throw new IllegalStateException();
                  } else {
                     int var5 = var8.length;
                     byte[] var6 = new byte[var5];
                     System.arraycopy(var8, 0, var6, 0, var5);
                     return var6;
                  }
               } else {
                  return var8;
               }
            }
         } else if(var0 instanceof class_277) {
            class_277 var3 = (class_277)var0;
            return var3.method_5132();
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: n (int, boolean, byte) byte[]
   static synchronized byte[] method_5660(int var0, boolean var1, byte var2) {
      try {
         byte[] var3;
         label170: {
            if(var0 != 100) {
               if(var2 <= 86) {
                  throw new IllegalStateException();
               }

               if(var0 >= 100 || !var1) {
                  break label170;
               }

               if(var2 <= 86) {
                  throw new IllegalStateException();
               }
            }

            if(-1219327977 * field_3799 > 0) {
               if(var2 <= 86) {
                  throw new IllegalStateException();
               }

               var3 = field_3796[(field_3799 -= 1851469735) * -1219327977];
               field_3796[-1219327977 * field_3799] = null;
               return var3;
            }
         }

         label161: {
            if(5000 != var0) {
               if(var2 <= 86) {
                  throw new IllegalStateException();
               }

               if(var0 >= 5000) {
                  break label161;
               }

               if(var2 <= 86) {
                  throw new IllegalStateException();
               }

               if(!var1) {
                  break label161;
               }

               if(var2 <= 86) {
                  throw new IllegalStateException();
               }
            }

            if(-1748405633 * field_3794 > 0) {
               if(var2 <= 86) {
                  throw new IllegalStateException();
               }

               var3 = field_3797[(field_3794 -= -731886209) * -1748405633];
               field_3797[field_3794 * -1748405633] = null;
               return var3;
            }
         }

         label151: {
            if(var0 != 30000) {
               if(var0 >= 30000) {
                  break label151;
               }

               if(var2 <= 86) {
                  throw new IllegalStateException();
               }

               if(!var1) {
                  break label151;
               }

               if(var2 <= 86) {
                  throw new IllegalStateException();
               }
            }

            if(field_3795 * 434807287 > 0) {
               if(var2 <= 86) {
                  throw new IllegalStateException();
               }

               var3 = field_3798[(field_3795 -= 472805319) * 434807287];
               field_3798[field_3795 * 434807287] = null;
               return var3;
            }
         }

         int var6;
         if(class_52.field_390 != null) {
            if(var2 <= 86) {
               throw new IllegalStateException();
            }

            for(var6 = 0; var6 < field_3793.length; ++var6) {
               if(var2 <= 86) {
                  throw new IllegalStateException();
               }

               if(field_3793[var6] != var0) {
                  if(var2 <= 86) {
                     throw new IllegalStateException();
                  }

                  if(var0 >= field_3793[var6]) {
                     continue;
                  }

                  if(var2 <= 86) {
                     throw new IllegalStateException();
                  }

                  if(!var1) {
                     continue;
                  }

                  if(var2 <= 86) {
                     throw new IllegalStateException();
                  }
               }

               if(field_3800[var6] > 0) {
                  if(var2 <= 86) {
                     throw new IllegalStateException();
                  }

                  byte[] var4 = class_52.field_390[var6][--field_3800[var6]];
                  class_52.field_390[var6][field_3800[var6]] = null;
                  return var4;
               }
            }
         }

         if(var1) {
            if(var2 <= 86) {
               throw new IllegalStateException();
            }

            if(field_3793 != null) {
               if(var2 <= 86) {
                  throw new IllegalStateException();
               }

               for(var6 = 0; var6 < field_3793.length; ++var6) {
                  if(var0 <= field_3793[var6] && field_3800[var6] < class_52.field_390[var6].length) {
                     if(var2 <= 86) {
                        throw new IllegalStateException();
                     }

                     return new byte[field_3793[var6]];
                  }
               }
            }
         }

         return new byte[var0];
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_3799 = 0;
      field_3794 = 0;
      field_3795 = 0;
      field_3796 = new byte[1000][];
      field_3797 = new byte[250][];
      field_3798 = new byte[50][];
   }

}
