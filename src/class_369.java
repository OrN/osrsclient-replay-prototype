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

    public Iterator iterator() {
      class_366 var10000 = new class_366(this);
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

    // $FF: renamed from: <init> (int) void
   public class_369(int var1) {
      super();
      this.field_4101 = 0;
      this.field_4099 = var1;
      this.field_4098 = new class_27[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class_27[] var10000 = this.field_4098;
         class_27 var10002 = new class_27();
         class_27 var3 = var10000[var2] = var10002;
         var3.field_10 = var3;
         var3.field_11 = var3;
      }

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

}
