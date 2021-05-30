
// $FF: renamed from: li
public class class_351 {

   // $FF: renamed from: n int
   public int field_3945;
   // $FF: renamed from: v int
   public int field_3946;
   // $FF: renamed from: f int
   public int field_3947;
   // $FF: renamed from: y int
   public int field_3948;


    // $FF: renamed from: f (li, li, byte) void
   public void method_6207(class_351 var1, class_351 var2) {
      try {
         this.method_6212(var1, var2, -1616583168);
         this.method_6213(var1, var2, (short)11660);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <init> (int, int, int, int) void
   public class_351(int var1, int var2, int var3, int var4) {
      super();
      try {
         this.method_6209(var1, var2);
         this.method_6210(var3, var4);
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: v (int, int, int) void
   public void method_6209(int var1, int var2) {
      try {
         this.field_3946 = var1 * 1658704639;
         this.field_3945 = var2 * -2070364785;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: n (int, int, int) void
   public void method_6210(int var1, int var2) {
      try {
         this.field_3947 = -888661779 * var1;
         this.field_3948 = 1584612999 * var2;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   public String toString() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

    // $FF: renamed from: y (li, li, int) void
   void method_6212(class_351 var1, class_351 var2, int var3) {
      try {
         var2.field_3946 = this.field_3946 * 1;
         var2.field_3947 = this.field_3947 * 1;
         if(this.field_3946 * -1774637825 < -1774637825 * var1.field_3946) {
            if(var3 == 69680089) {
               throw new IllegalStateException();
            }

            var2.field_3947 -= 203329555 * var1.field_3946 - this.field_3946 * 203329555;
            var2.field_3946 = var1.field_3946 * 1;
         }

         if(var2.method_6214() > var1.method_6214()) {
            if(var3 == 69680089) {
               return;
            }

            var2.field_3947 -= (var2.method_6214() - var1.method_6214()) * -888661779;
         }

         if(var2.field_3947 * -250215195 < 0) {
            if(var3 == 69680089) {
               return;
            }

            var2.field_3947 = 0;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: p (li, li, short) void
   void method_6213(class_351 var1, class_351 var2, short var3) {
      try {
         var2.field_3945 = 1 * this.field_3945;
         var2.field_3948 = this.field_3948 * 1;
         if(47432047 * this.field_3945 < var1.field_3945 * 47432047) {
            if(var3 <= 255) {
               return;
            }

            var2.field_3948 -= 191650697 * var1.field_3945 - 191650697 * this.field_3945;
            var2.field_3945 = 1 * var1.field_3945;
         }

         if(var2.method_6215() > var1.method_6215()) {
            if(var3 <= 255) {
               return;
            }

            var2.field_3948 -= (var2.method_6215() - var1.method_6215()) * 1584612999;
         }

         if(1839374135 * var2.field_3948 < 0) {
            if(var3 <= 255) {
               return;
            }

            var2.field_3948 = 0;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: j (byte) int
   int method_6214() {
      try {
         return this.field_3947 * -250215195 + this.field_3946 * -1774637825;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: r (byte) int
   int method_6215() {
      try {
         return 1839374135 * this.field_3948 + this.field_3945 * 47432047;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: <init> (int, int) void
   public class_351(int var1, int var2) {
      this(0, 0, var1, var2);
      try {
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

}
