package id.ac.polinema.quiz2;

/**
 * TAHAP 1 (pemanasan): penumpang yang membuat pesanan.
 *
 * Lengkapi setiap method (ganti baris
 * {@code throw new UnsupportedOperationException(...)} dengan kode yang benar).
 * Jangan mengubah nama kelas, nama method, atau signature-nya.
 *
 * Deklarasikan sendiri field-nya sesuai diagram kelas di README.
 * Semua field harus private.
 */
public class Passenger {
    String passengerId;
    String name;

    /**
     * Menyimpan kedua parameter ke field.
     *
     * @param passengerId kode penumpang
     * @param name nama penumpang
     */
    public Passenger(String passengerId, String name) {
        this.passengerId = passengerId;
        this.name = name;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getPassengerId() {
        return passengerId;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getName() {
        return name;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Mengubah nama. Nama yang null atau kosong (hanya spasi) tidak valid:
     * abaikan dan biarkan nama lama tetap.
     *
     * @param name nama baru
     */
    public void setName(String name) {
        if(name != null && !name.trim().isEmpty()){
            this.name = name;
        }
        // throw new UnsupportedOperationException("Not implemented yet");
    }
}
