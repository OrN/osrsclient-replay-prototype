import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// $FF: renamed from: cr
public class class_174 {

   // $FF: renamed from: a int
   public static final int field_2166 = 33;
   // $FF: renamed from: n java.util.concurrent.Future
   Future field_2167;
   // $FF: renamed from: v java.util.concurrent.ExecutorService
   ExecutorService field_2168;


   // $FF: renamed from: d () boolean
   boolean method_3713() {
      return this.field_2167.isDone();
   }

   // $FF: renamed from: v (byte) void
   void method_3714(byte var1) {
      try {
         this.field_2168.shutdown();
         this.field_2168 = null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "cr.v(" + ')');
      }
   }

   // $FF: renamed from: n (int) boolean
   boolean method_3715(int var1) {
      try {
         return this.field_2167.isDone();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "cr.n(" + ')');
      }
   }

   // $FF: renamed from: s () java.security.SecureRandom
   SecureRandom method_3716() {
      try {
         return (SecureRandom)this.field_2167.get();
      } catch (Exception var2) {
         return class_275.method_5124(-1526667717);
      }
   }

   // $FF: renamed from: f (byte) java.security.SecureRandom
   SecureRandom method_3717(byte var1) {
      try {
         try {
            return (SecureRandom)this.field_2167.get();
         } catch (Exception var3) {
            return class_275.method_5124(-1490609257);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "cr.f(" + ')');
      }
   }

   // $FF: renamed from: p () void
   void method_3718() {
      this.field_2168.shutdown();
      this.field_2168 = null;
   }

   // $FF: renamed from: j () void
   void method_3719() {
      this.field_2168.shutdown();
      this.field_2168 = null;
   }

   // $FF: renamed from: l () java.security.SecureRandom
   SecureRandom method_3720() {
      try {
         return (SecureRandom)this.field_2167.get();
      } catch (Exception var2) {
         return class_275.method_5124(-1896047539);
      }
   }

   // $FF: renamed from: b () boolean
   boolean method_3721() {
      return this.field_2167.isDone();
   }

   // $FF: renamed from: y () void
   void method_3722() {
      this.field_2168.shutdown();
      this.field_2168 = null;
   }

   // $FF: renamed from: n (mr, int, int, int) int
   static int method_3723(class_369 var0, int var1, int var2, int var3) {
      try {
         if(var0 == null) {
            if(var3 >= -357010009) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            class_32 var4 = (class_32)var0.method_6586((long)var1);
            if(var4 == null) {
               if(var3 >= -357010009) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               return var4.field_58;
            }
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "cr.n(" + ')');
      }
   }

   // $FF: renamed from: u () java.security.SecureRandom
   SecureRandom method_3724() {
      try {
         return (SecureRandom)this.field_2167.get();
      } catch (Exception var2) {
         return class_275.method_5124(-2062025323);
      }
   }

   // $FF: renamed from: r () void
   void method_3725() {
      this.field_2168.shutdown();
      this.field_2168 = null;
   }

   // $FF: renamed from: <init> () void
   void method_3726() {
      try {
         super();
         this.field_2168 = Executors.newSingleThreadExecutor();
         ExecutorService var10001 = this.field_2168;
         class_172 var10002 = new class_172;
         var10002.method_3707();
         this.field_2167 = var10001.submit(var10002);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cr.<init>(" + ')');
      }
   }

   // $FF: renamed from: fa (int, int) int
   static int method_3727(int var0, int var1) {
      try {
         return var0 * 3 + 600;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "cr.fa(" + ')');
      }
   }

   // $FF: renamed from: v (int[], int[], int) void
   public static void method_3728(int[] var0, int[] var1, int var2) {
      try {
         if(null != var0) {
            if(var2 == -127678164) {
               throw new IllegalStateException();
            }

            if(var1 != null) {
               class_319.field_3793 = var0;
               class_319.field_3800 = new int[var0.length];
               class_52.field_390 = new byte[var0.length][][];

               for(int var3 = 0; var3 < class_319.field_3793.length; ++var3) {
                  class_52.field_390[var3] = new byte[var1[var3]][];
               }

               return;
            }

            if(var2 == -127678164) {
               throw new IllegalStateException();
            }
         }

         class_319.field_3793 = null;
         class_319.field_3800 = null;
         class_52.field_390 = (byte[][][])null;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "cr.v(" + ')');
      }
   }

   // $FF: renamed from: v (int, int) java.lang.String
   static String method_3729(int var0, int var1) {
      try {
         return "<img=" + var0 + ">";
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "cr.v(" + ')');
      }
   }

   // $FF: renamed from: o () java.security.SecureRandom
   SecureRandom method_3730() {
      try {
         return (SecureRandom)this.field_2167.get();
      } catch (Exception var2) {
         return class_275.method_5124(-1920099772);
      }
   }
}
