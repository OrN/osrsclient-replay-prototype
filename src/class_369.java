import java.util.Iterator;

// $FF: renamed from: mr
public final class class_369 implements Iterable {

   // $FF: renamed from: f mw
   class_27 field_4097;
   // $FF: renamed from: n mw[]
   class_27[] field_4098;
   // $FF: renamed from: v int
   int field_4099;
   // $FF: renamed from: y mw
   class_27 field_4100;
   // $FF: renamed from: p int
   int field_4101;


   // $FF: renamed from: l () void
   public void method_6580() {
      int var1 = 0;

      while(var1 < this.field_4099) {
         class_27 var2 = this.field_4098[var1];

         while(true) {
            class_27 var3 = var2.field_10;
            if(var3 == var2) {
               ++var1;
               break;
            }

            var3.method_108();
         }
      }

      this.field_4097 = null;
      this.field_4100 = null;
   }

   // $FF: renamed from: e () mw
   public class_27 method_6581() {
      this.field_4101 = 0;
      return this.method_6585();
   }

   // $FF: renamed from: o () void
   public void method_6582() {
      int var1 = 0;

      while(var1 < this.field_4099) {
         class_27 var2 = this.field_4098[var1];

         while(true) {
            class_27 var3 = var2.field_10;
            if(var3 == var2) {
               ++var1;
               break;
            }

            var3.method_108();
         }
      }

      this.field_4097 = null;
      this.field_4100 = null;
   }

   // $FF: renamed from: j (long) mw
   public class_27 method_6583(long var1) {
      class_27 var3 = this.field_4098[(int)(var1 & (long)(this.field_4099 - 1))];

      for(this.field_4097 = var3.field_10; this.field_4097 != var3; this.field_4097 = this.field_4097.field_10) {
         if(this.field_4097.field_9 == var1) {
            class_27 var4 = this.field_4097;
            this.field_4097 = this.field_4097.field_10;
            return var4;
         }
      }

      this.field_4097 = null;
      return null;
   }

   // $FF: renamed from: y () mw
   public class_27 method_6584() {
      this.field_4101 = 0;
      return this.method_6585();
   }

   // $FF: renamed from: p () mw
   public class_27 method_6585() {
      class_27 var1;
      if(this.field_4101 > 0 && this.field_4100 != this.field_4098[this.field_4101 - 1]) {
         var1 = this.field_4100;
         this.field_4100 = var1.field_10;
         return var1;
      } else {
         do {
            if(this.field_4101 >= this.field_4099) {
               return null;
            }

            var1 = this.field_4098[this.field_4101++].field_10;
         } while(var1 == this.field_4098[this.field_4101 - 1]);

         this.field_4100 = var1.field_10;
         return var1;
      }
   }

   // $FF: renamed from: v (long) mw
   public class_27 method_6586(long var1) {
      class_27 var3 = this.field_4098[(int)(var1 & (long)(this.field_4099 - 1))];

      for(this.field_4097 = var3.field_10; this.field_4097 != var3; this.field_4097 = this.field_4097.field_10) {
         if(this.field_4097.field_9 == var1) {
            class_27 var4 = this.field_4097;
            this.field_4097 = this.field_4097.field_10;
            return var4;
         }
      }

      this.field_4097 = null;
      return null;
   }

   // $FF: renamed from: aj () java.util.Iterator
   public Iterator method_6587() {
      class_366 var10000 = new class_366;
      var10000.method_6560(this);
      return var10000;
   }

   public Iterator iterator() {
      class_366 var10000 = new class_366;
      var10000.method_6560(this);
      return var10000;
   }

   // $FF: renamed from: n (mw, long) void
   public void method_6588(class_27 var1, long var2) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      class_27 var4 = this.field_4098[(int)(var2 & (long)(this.field_4099 - 1))];
      var1.field_11 = var4.field_11;
      var1.field_10 = var4;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
      var1.field_9 = var2;
   }

   // $FF: renamed from: b (long) mw
   public class_27 method_6589(long var1) {
      class_27 var3 = this.field_4098[(int)(var1 & (long)(this.field_4099 - 1))];

      for(this.field_4097 = var3.field_10; this.field_4097 != var3; this.field_4097 = this.field_4097.field_10) {
         if(this.field_4097.field_9 == var1) {
            class_27 var4 = this.field_4097;
            this.field_4097 = this.field_4097.field_10;
            return var4;
         }
      }

      this.field_4097 = null;
      return null;
   }

   // $FF: renamed from: <init> (int) void
   public void method_6590(int var1) {
      super();
      this.field_4101 = 0;
      this.field_4099 = var1;
      this.field_4098 = new class_27[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class_27[] var10000 = this.field_4098;
         class_27 var10002 = new class_27;
         var10002.method_105();
         class_27 var3 = var10000[var2] = var10002;
         var3.field_10 = var3;
         var3.field_11 = var3;
      }

   }

   // $FF: renamed from: s (mw, long) void
   public void method_6591(class_27 var1, long var2) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      class_27 var4 = this.field_4098[(int)(var2 & (long)(this.field_4099 - 1))];
      var1.field_11 = var4.field_11;
      var1.field_10 = var4;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
      var1.field_9 = var2;
   }

   // $FF: renamed from: u (mw, long) void
   public void method_6592(class_27 var1, long var2) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      class_27 var4 = this.field_4098[(int)(var2 & (long)(this.field_4099 - 1))];
      var1.field_11 = var4.field_11;
      var1.field_10 = var4;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
      var1.field_9 = var2;
   }

   // $FF: renamed from: r (long) mw
   public class_27 method_6593(long var1) {
      class_27 var3 = this.field_4098[(int)(var1 & (long)(this.field_4099 - 1))];

      for(this.field_4097 = var3.field_10; this.field_4097 != var3; this.field_4097 = this.field_4097.field_10) {
         if(this.field_4097.field_9 == var1) {
            class_27 var4 = this.field_4097;
            this.field_4097 = this.field_4097.field_10;
            return var4;
         }
      }

      this.field_4097 = null;
      return null;
   }

   // $FF: renamed from: c () mw
   public class_27 method_6594() {
      this.field_4101 = 0;
      return this.method_6585();
   }

   // $FF: renamed from: d (long) mw
   public class_27 method_6595(long var1) {
      class_27 var3 = this.field_4098[(int)(var1 & (long)(this.field_4099 - 1))];

      for(this.field_4097 = var3.field_10; this.field_4097 != var3; this.field_4097 = this.field_4097.field_10) {
         if(this.field_4097.field_9 == var1) {
            class_27 var4 = this.field_4097;
            this.field_4097 = this.field_4097.field_10;
            return var4;
         }
      }

      this.field_4097 = null;
      return null;
   }

   // $FF: renamed from: f () void
   public void method_6596() {
      int var1 = 0;

      while(var1 < this.field_4099) {
         class_27 var2 = this.field_4098[var1];

         while(true) {
            class_27 var3 = var2.field_10;
            if(var3 == var2) {
               ++var1;
               break;
            }

            var3.method_108();
         }
      }

      this.field_4097 = null;
      this.field_4100 = null;
   }

   // $FF: renamed from: g () mw
   public class_27 method_6597() {
      this.field_4101 = 0;
      return this.method_6585();
   }

   // $FF: renamed from: a () mw
   public class_27 method_6598() {
      this.field_4101 = 0;
      return this.method_6585();
   }

   // $FF: renamed from: k () mw
   public class_27 method_6599() {
      this.field_4101 = 0;
      return this.method_6585();
   }

   // $FF: renamed from: m () mw
   public class_27 method_6600() {
      class_27 var1;
      if(this.field_4101 > 0 && this.field_4100 != this.field_4098[this.field_4101 - 1]) {
         var1 = this.field_4100;
         this.field_4100 = var1.field_10;
         return var1;
      } else {
         do {
            if(this.field_4101 >= this.field_4099) {
               return null;
            }

            var1 = this.field_4098[this.field_4101++].field_10;
         } while(var1 == this.field_4098[this.field_4101 - 1]);

         this.field_4100 = var1.field_10;
         return var1;
      }
   }
}
