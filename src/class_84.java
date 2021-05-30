
// $FF: renamed from: ej
public class class_84 extends class_59 {

   // $FF: renamed from: v jv
   static class_306 field_783;
   // $FF: renamed from: n hz
   static class_272 field_784;
   // $FF: renamed from: f boolean
   public boolean field_785;


   // $FF: renamed from: f (nd, byte) void
   void method_1410(class_28 var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.method_130(-1216400069);
            if(var3 == 0) {
               if(var2 >= 0) {
                  return;
               }

               return;
            }

            this.method_1421(var1, var3, (byte)34);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ej.f(" + ')');
      }
   }

   // $FF: renamed from: e (nd, int) void
   void method_1411(class_28 var1, int var2) {
      if(2 == var2) {
         this.field_785 = true;
      }

   }

   // $FF: renamed from: b (jv) void
   public static void method_1412(class_306 var0) {
      field_783 = var0;
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_784 = var10000;
   }

   // $FF: renamed from: p (jv) void
   public static void method_1414(class_306 var0) {
      field_783 = var0;
   }

   // $FF: renamed from: j (jv) void
   public static void method_1415(class_306 var0) {
      field_783 = var0;
   }

   // $FF: renamed from: r (jv) void
   public static void method_1416(class_306 var0) {
      field_783 = var0;
   }

   // $FF: renamed from: n (int, short) es
   public static class_78 method_1417(int var0, short var1) {
      try {
         class_78 var2 = (class_78)class_78.field_671.method_5065((long)var0);
         if(var2 != null) {
            if(var1 == 256) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class_78.field_669.method_5381(13, var0, -26460885);
            class_78 var10000 = new class_78();
            var2 = var10000;
            var2.field_675 = 850117983 * var0;
            if(var3 != null) {
               if(var1 == 256) {
                  throw new IllegalStateException();
               }

               class_28 var10001 = new class_28(var3);
               var2.method_1224(var10001, -929011134);
            }

            class_78.field_671.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ej.n(" + ')');
      }
   }

   // $FF: renamed from: d (jv) void
   public static void method_1418(class_306 var0) {
      field_783 = var0;
   }

   // $FF: renamed from: s (int) ej
   public static class_84 method_1419(int var0) {
      class_84 var1 = (class_84)field_784.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_783.method_5381(19, var0, -26460885);
         class_84 var10000 = new class_84();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1410(var10001, (byte)-3);
         }

         field_784.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: u (int) ej
   public static class_84 method_1420(int var0) {
      class_84 var1 = (class_84)field_784.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_783.method_5381(19, var0, -26460885);
         class_84 var10000 = new class_84();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1410(var10001, (byte)-98);
         }

         field_784.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: y (nd, int, byte) void
   void method_1421(class_28 var1, int var2, byte var3) {
      try {
         if(2 == var2) {
            if(var3 == 7) {
               return;
            }

            this.field_785 = true;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ej.y(" + ')');
      }
   }

   // $FF: renamed from: o (nd) void
   void method_1422(class_28 var1) {
      while(true) {
         int var2 = var1.method_130(2039362391);
         if(var2 == 0) {
            return;
         }

         this.method_1421(var1, var2, (byte)101);
      }
   }

   // $FF: renamed from: c (nd) void
   void method_1423(class_28 var1) {
      while(true) {
         int var2 = var1.method_130(-1395433572);
         if(var2 == 0) {
            return;
         }

         this.method_1421(var1, var2, (byte)26);
      }
   }

   // $FF: renamed from: l (int) ej
   public static class_84 method_1424(int var0) {
      class_84 var1 = (class_84)field_784.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_783.method_5381(19, var0, -26460885);
         class_84 var10000 = new class_84();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1410(var10001, (byte)-127);
         }

         field_784.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: <init> () void
   class_84() {
      super();
      try {
         this.field_785 = false;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ej.<init>(" + ')');
      }
   }

   // $FF: renamed from: a (nd, int) void
   void method_1425(class_28 var1, int var2) {
      if(2 == var2) {
         this.field_785 = true;
      }

   }

   // $FF: renamed from: jc (io, int, int, byte) void
   static final void method_1426(class_37 var0, int var1, int var2, byte var3) {
      try {
         if(client.field_1590 == null) {
            if(!client.field_1553) {
               if(var0 != null) {
                  if(var3 != 8) {
                     return;
                  }

                  if(class_171.method_3663(var0, -778219160) != null) {
                     client.field_1590 = var0;
                     client.field_1591 = class_171.method_3663(var0, -696687878);
                     client.field_1592 = 1148986229 * var1;
                     client.field_1445 = var2 * 1101849211;
                     class_98.field_1137 = 0;
                     client.field_1601 = false;
                     int var4 = class_192.method_3959(-1594517863);
                     if(var4 != -1) {
                        if(var3 != 8) {
                           throw new IllegalStateException();
                        }

                        class_173 var10000 = new class_173();
                        class_58.field_465 = var10000;
                        class_58.field_465.field_2162 = client.field_1555[var4] * 2026453639;
                        class_58.field_465.field_2161 = client.field_1610[var4] * -1098570769;
                        class_58.field_465.field_2164 = client.field_1557[var4] * -377482425;
                        class_58.field_465.field_2163 = client.field_1558[var4] * -1728118443;
                        class_58.field_465.field_2160 = client.field_1631[var4];
                     }

                     return;
                  }

                  if(var3 != 8) {
                     return;
                  }
               }

               return;
            }

            if(var3 != 8) {
               throw new IllegalStateException();
            }
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "ej.jc(" + ')');
      }
   }

   // $FF: renamed from: g (nd, int) void
   void method_1427(class_28 var1, int var2) {
      if(2 == var2) {
         this.field_785 = true;
      }

   }

   // $FF: renamed from: j (int) void
   public static void method_1428(int var0) {
      try {
         if(class_314.field_3771 != null) {
            class_314.field_3771.method_4123(1840761151);
         }

      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ej.j(" + ')');
      }
   }
}
