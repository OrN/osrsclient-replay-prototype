
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
            return var3.method_5132((byte)74);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "ke.n(" + ')');
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
         throw class_223.method_4281(var5, "ke.n(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_5661() {
      field_3799 = 0;
      field_3794 = 0;
      field_3795 = 0;
      field_3796 = new byte[1000][];
      field_3797 = new byte[250][];
      field_3798 = new byte[50][];
   }

   // $FF: renamed from: k (byte[]) void
   public static synchronized void method_5662(byte[] var0) {
      if(100 == var0.length && field_3799 * -1219327977 < 1000) {
         field_3796[(field_3799 += 1851469735) * -1219327977 - 1] = var0;
      } else if(5000 == var0.length && -1748405633 * field_3794 < 250) {
         field_3797[(field_3794 += -731886209) * -1748405633 - 1] = var0;
      } else if(30000 == var0.length && field_3795 * 434807287 < 50) {
         field_3798[(field_3795 += 472805319) * 434807287 - 1] = var0;
      } else {
         if(class_52.field_390 != null) {
            for(int var1 = 0; var1 < field_3793.length; ++var1) {
               if(var0.length == field_3793[var1] && field_3800[var1] < class_52.field_390[var1].length) {
                  class_52.field_390[var1][field_3800[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }

   // $FF: renamed from: j (int[], int[]) void
   public static void method_5663(int[] var0, int[] var1) {
      if(null != var0 && var1 != null) {
         field_3793 = var0;
         field_3800 = new int[var0.length];
         class_52.field_390 = new byte[var0.length][][];

         for(int var2 = 0; var2 < field_3793.length; ++var2) {
            class_52.field_390[var2] = new byte[var1[var2]][];
         }

      } else {
         field_3793 = null;
         field_3800 = null;
         class_52.field_390 = (byte[][][])null;
      }
   }

   // $FF: renamed from: r (int[], int[]) void
   public static void method_5664(int[] var0, int[] var1) {
      if(null != var0 && var1 != null) {
         field_3793 = var0;
         field_3800 = new int[var0.length];
         class_52.field_390 = new byte[var0.length][][];

         for(int var2 = 0; var2 < field_3793.length; ++var2) {
            class_52.field_390[var2] = new byte[var1[var2]][];
         }

      } else {
         field_3793 = null;
         field_3800 = null;
         class_52.field_390 = (byte[][][])null;
      }
   }

   // $FF: renamed from: b (int, boolean) byte[]
   static synchronized byte[] method_5665(int var0, boolean var1) {
      byte[] var4;
      if((var0 == 100 || var0 < 100 && var1) && -1219327977 * field_3799 > 0) {
         var4 = field_3796[(field_3799 -= 1851469735) * -1219327977];
         field_3796[-1219327977 * field_3799] = null;
         return var4;
      } else if((5000 == var0 || var0 < 5000 && var1) && -1748405633 * field_3794 > 0) {
         var4 = field_3797[(field_3794 -= -731886209) * -1748405633];
         field_3797[field_3794 * -1748405633] = null;
         return var4;
      } else if((var0 == 30000 || var0 < 30000 && var1) && field_3795 * 434807287 > 0) {
         var4 = field_3798[(field_3795 -= 472805319) * 434807287];
         field_3798[field_3795 * 434807287] = null;
         return var4;
      } else {
         int var2;
         if(class_52.field_390 != null) {
            for(var2 = 0; var2 < field_3793.length; ++var2) {
               if((field_3793[var2] == var0 || var0 < field_3793[var2] && var1) && field_3800[var2] > 0) {
                  byte[] var3 = class_52.field_390[var2][--field_3800[var2]];
                  class_52.field_390[var2][field_3800[var2]] = null;
                  return var3;
               }
            }
         }

         if(var1 && field_3793 != null) {
            for(var2 = 0; var2 < field_3793.length; ++var2) {
               if(var0 <= field_3793[var2] && field_3800[var2] < class_52.field_390[var2].length) {
                  return new byte[field_3793[var2]];
               }
            }
         }

         return new byte[var0];
      }
   }

   // $FF: renamed from: d (int, boolean) byte[]
   static synchronized byte[] method_5666(int var0, boolean var1) {
      byte[] var4;
      if((var0 == 100 || var0 < 100 && var1) && -1219327977 * field_3799 > 0) {
         var4 = field_3796[(field_3799 -= 1851469735) * -1219327977];
         field_3796[-1219327977 * field_3799] = null;
         return var4;
      } else if((5000 == var0 || var0 < 5000 && var1) && -1748405633 * field_3794 > 0) {
         var4 = field_3797[(field_3794 -= -731886209) * -1748405633];
         field_3797[field_3794 * -1748405633] = null;
         return var4;
      } else if((var0 == 30000 || var0 < 30000 && var1) && field_3795 * 434807287 > 0) {
         var4 = field_3798[(field_3795 -= 472805319) * 434807287];
         field_3798[field_3795 * 434807287] = null;
         return var4;
      } else {
         int var2;
         if(class_52.field_390 != null) {
            for(var2 = 0; var2 < field_3793.length; ++var2) {
               if((field_3793[var2] == var0 || var0 < field_3793[var2] && var1) && field_3800[var2] > 0) {
                  byte[] var3 = class_52.field_390[var2][--field_3800[var2]];
                  class_52.field_390[var2][field_3800[var2]] = null;
                  return var3;
               }
            }
         }

         if(var1 && field_3793 != null) {
            for(var2 = 0; var2 < field_3793.length; ++var2) {
               if(var0 <= field_3793[var2] && field_3800[var2] < class_52.field_390[var2].length) {
                  return new byte[field_3793[var2]];
               }
            }
         }

         return new byte[var0];
      }
   }

   // $FF: renamed from: e (byte[]) void
   public static synchronized void method_5667(byte[] var0) {
      if(1049419164 == var0.length && field_3799 * -1652420279 < 1000) {
         field_3796[(field_3799 += 1851469735) * -1219327977 - 1] = var0;
      } else if(5000 == var0.length && -1528635366 * field_3794 < 1708168017) {
         field_3797[(field_3794 += 1371698959) * 2016142296 - 1] = var0;
      } else if(30000 == var0.length && field_3795 * 745386126 < 1501452522) {
         field_3798[(field_3795 += 1079302828) * -1472304032 - 1] = var0;
      } else {
         if(class_52.field_390 != null) {
            for(int var1 = 0; var1 < field_3793.length; ++var1) {
               if(var0.length == field_3793[var1] && field_3800[var1] < class_52.field_390[var1].length) {
                  class_52.field_390[var1][field_3800[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }

   // $FF: renamed from: u (int, boolean) byte[]
   static synchronized byte[] method_5668(int var0, boolean var1) {
      byte[] var4;
      if((var0 == 100 || var0 < -647107670 && var1) && -1219327977 * field_3799 > 0) {
         var4 = field_3796[(field_3799 -= 1851469735) * -1219327977];
         field_3796[-387895405 * field_3799] = null;
         return var4;
      } else if((-1842086709 == var0 || var0 < 5000 && var1) && -1748405633 * field_3794 > 0) {
         var4 = field_3797[(field_3794 -= -731886209) * 1831475585];
         field_3797[field_3794 * -1748405633] = null;
         return var4;
      } else if((var0 == -143103964 || var0 < -966149771 && var1) && field_3795 * -923841569 > 0) {
         var4 = field_3798[(field_3795 -= 221015162) * -836658939];
         field_3798[field_3795 * 434807287] = null;
         return var4;
      } else {
         int var2;
         if(class_52.field_390 != null) {
            for(var2 = 0; var2 < field_3793.length; ++var2) {
               if((field_3793[var2] == var0 || var0 < field_3793[var2] && var1) && field_3800[var2] > 0) {
                  byte[] var3 = class_52.field_390[var2][--field_3800[var2]];
                  class_52.field_390[var2][field_3800[var2]] = null;
                  return var3;
               }
            }
         }

         if(var1 && field_3793 != null) {
            for(var2 = 0; var2 < field_3793.length; ++var2) {
               if(var0 <= field_3793[var2] && field_3800[var2] < class_52.field_390[var2].length) {
                  return new byte[field_3793[var2]];
               }
            }
         }

         return new byte[var0];
      }
   }

   // $FF: renamed from: g (byte[]) void
   public static synchronized void method_5669(byte[] var0) {
      if(100 == var0.length && field_3799 * -1797029558 < 1000) {
         field_3796[(field_3799 += 1851469735) * -1219327977 - 1] = var0;
      } else if(5000 == var0.length && -1748405633 * field_3794 < 3791627) {
         field_3797[(field_3794 += 1515784793) * -969102861 - 1] = var0;
      } else if(857396062 == var0.length && field_3795 * -2018574733 < 50) {
         field_3798[(field_3795 += -1281662932) * 434807287 - 1] = var0;
      } else {
         if(class_52.field_390 != null) {
            for(int var1 = 0; var1 < field_3793.length; ++var1) {
               if(var0.length == field_3793[var1] && field_3800[var1] < class_52.field_390[var1].length) {
                  class_52.field_390[var1][field_3800[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }

   // $FF: renamed from: o (int) byte[]
   public static synchronized byte[] method_5670(int var0) {
      return method_5660(var0, false, (byte)113);
   }

   // $FF: renamed from: c (int) byte[]
   public static synchronized byte[] method_5671(int var0) {
      return method_5660(var0, false, (byte)121);
   }

   // $FF: renamed from: p (int[], int[]) void
   public static void method_5672(int[] var0, int[] var1) {
      if(null != var0 && var1 != null) {
         field_3793 = var0;
         field_3800 = new int[var0.length];
         class_52.field_390 = new byte[var0.length][][];

         for(int var2 = 0; var2 < field_3793.length; ++var2) {
            class_52.field_390[var2] = new byte[var1[var2]][];
         }

      } else {
         field_3793 = null;
         field_3800 = null;
         class_52.field_390 = (byte[][][])null;
      }
   }

   // $FF: renamed from: <init> () void
   void method_5673() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ke.<init>(" + ')');
      }
   }

   // $FF: renamed from: l (int) byte[]
   public static synchronized byte[] method_5674(int var0) {
      return method_5660(var0, false, (byte)117);
   }

   // $FF: renamed from: a (byte[]) void
   public static synchronized void method_5675(byte[] var0) {
      if(100 == var0.length && field_3799 * -1219327977 < 1000) {
         field_3796[(field_3799 += 1851469735) * -1219327977 - 1] = var0;
      } else if(2068100207 == var0.length && -1748405633 * field_3794 < 250) {
         field_3797[(field_3794 += 1406804566) * -567614763 - 1] = var0;
      } else if(30000 == var0.length && field_3795 * -607881521 < 50) {
         field_3798[(field_3795 += 472805319) * 434807287 - 1] = var0;
      } else {
         if(class_52.field_390 != null) {
            for(int var1 = 0; var1 < field_3793.length; ++var1) {
               if(var0.length == field_3793[var1] && field_3800[var1] < class_52.field_390[var1].length) {
                  class_52.field_390[var1][field_3800[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }

   // $FF: renamed from: s (int, boolean) byte[]
   static synchronized byte[] method_5676(int var0, boolean var1) {
      byte[] var4;
      if((var0 == 100 || var0 < 100 && var1) && -1219327977 * field_3799 > 0) {
         var4 = field_3796[(field_3799 -= 1851469735) * -1219327977];
         field_3796[-1219327977 * field_3799] = null;
         return var4;
      } else if((5000 == var0 || var0 < 5000 && var1) && -1748405633 * field_3794 > 0) {
         var4 = field_3797[(field_3794 -= -731886209) * -1748405633];
         field_3797[field_3794 * -1748405633] = null;
         return var4;
      } else if((var0 == 30000 || var0 < 30000 && var1) && field_3795 * 434807287 > 0) {
         var4 = field_3798[(field_3795 -= 472805319) * 434807287];
         field_3798[field_3795 * 434807287] = null;
         return var4;
      } else {
         int var2;
         if(class_52.field_390 != null) {
            for(var2 = 0; var2 < field_3793.length; ++var2) {
               if((field_3793[var2] == var0 || var0 < field_3793[var2] && var1) && field_3800[var2] > 0) {
                  byte[] var3 = class_52.field_390[var2][--field_3800[var2]];
                  class_52.field_390[var2][field_3800[var2]] = null;
                  return var3;
               }
            }
         }

         if(var1 && field_3793 != null) {
            for(var2 = 0; var2 < field_3793.length; ++var2) {
               if(var0 <= field_3793[var2] && field_3800[var2] < class_52.field_390[var2].length) {
                  return new byte[field_3793[var2]];
               }
            }
         }

         return new byte[var0];
      }
   }
}
