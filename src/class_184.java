
// $FF: renamed from: du
public class class_184 extends class_181 {

   // $FF: renamed from: v boolean
   final boolean field_2254;
   // $FF: renamed from: e int
   static final int field_2255 = 15;
   // $FF: renamed from: p int
   static int field_2256;
   // $FF: renamed from: g int
   public static int field_2257;


   // $FF: renamed from: y (java.lang.Object, java.lang.Object) int
   public int method_3846(Object var1, Object var2) {
      return this.method_3847((class_339)var1, (class_339)var2, 2125092763);
   }

   // $FF: renamed from: v (lv, lv, int) int
   int method_3847(class_339 var1, class_339 var2, int var3) {
      try {
         if(var1.field_3888 * 1693720149 == 1396273817 * client.field_1413) {
            if(var3 <= -1599933776) {
               throw new IllegalStateException();
            }

            if(1396273817 * client.field_1413 == var2.field_3888 * 1693720149) {
               if(var3 <= -1599933776) {
                  throw new IllegalStateException();
               }

               int var10000;
               if(this.field_2254) {
                  if(var3 <= -1599933776) {
                     throw new IllegalStateException();
                  }

                  var10000 = var1.field_3885 * -1023710905 - -1023710905 * var2.field_3885;
               } else {
                  var10000 = var2.field_3885 * -1023710905 - -1023710905 * var1.field_3885;
               }

               return var10000;
            }
         }

         return this.method_3830(var1, var2, (byte)0);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "du.v(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_3847((class_339)var1, (class_339)var2, 254646745);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "du.compare(" + ')');
      }
   }

   // $FF: renamed from: <init> (boolean) void
   public class_184(boolean var1) {
      super();
      try {
         this.field_2254 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "du.<init>(" + ')');
      }
   }

   // $FF: renamed from: p (java.lang.Object, java.lang.Object) int
   public int method_3849(Object var1, Object var2) {
      return this.method_3847((class_339)var1, (class_339)var2, 1266337461);
   }

   // $FF: renamed from: v (jv, int) void
   public static void method_3850(class_306 var0, int var1) {
      try {
         class_89.field_897 = var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "du.v(" + ')');
      }
   }

   // $FF: renamed from: f (lv, lv) int
   int method_3851(class_339 var1, class_339 var2) {
      return var1.field_3888 * 1693720149 == 1396273817 * client.field_1413 && 1396273817 * client.field_1413 == var2.field_3888 * 1693720149?(this.field_2254?var1.field_3885 * -1023710905 - -1023710905 * var2.field_3885:var2.field_3885 * -1023710905 - -1023710905 * var1.field_3885):this.method_3830(var1, var2, (byte)0);
   }

   // $FF: renamed from: s (char, byte) boolean
   public static boolean method_3852(char var0, byte var1) {
      try {
         boolean var10000;
         if(var0 >= 48) {
            if(var1 >= 0) {
               throw new IllegalStateException();
            }

            if(var0 <= 57) {
               if(var1 >= 0) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "du.s(" + ')');
      }
   }

   // $FF: renamed from: e (int, int) int
   public static int method_3853(int var0, int var1) {
      try {
         if(var0 > 0) {
            return 1;
         } else if(var0 < 0) {
            if(var1 >= -360543950) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "du.e(" + ')');
      }
   }

   // $FF: renamed from: n (lv, lv) int
   int method_3854(class_339 var1, class_339 var2) {
      return var1.field_3888 * 1693720149 == 1396273817 * client.field_1413 && 1396273817 * client.field_1413 == var2.field_3888 * 1693720149?(this.field_2254?var1.field_3885 * -1023710905 - -1023710905 * var2.field_3885:var2.field_3885 * -1023710905 - -1023710905 * var1.field_3885):this.method_3830(var1, var2, (byte)0);
   }
}
