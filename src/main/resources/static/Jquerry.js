function kjop() {

    const innBilett = {

        film: $("#Filmen").val(),
        antall: $("#Antall").val(),
        fornavn: $("#Fornavn").val(),
        etternavn: $("#Etternavn").val(),
        tlf: $("#Tlf").val(),
        epost: $("#Epost").val()
    }

    $("#ErrorAntall").html("");
    $("#ErrorFornavn").html("");
    $("#ErrorEtternavn").html("");
    $("#ErrorTlf").html("");
    $("#ErrorEpost").html("");


    let Error = 0

    if (innBilett.film === "Velg") {
        Error++;
    }
    if (innBilett.antall == null || innBilett.antall === '') {
        $("#ErrorAntall").html("Må skrive noe i antall");
        Error++;
    }
    if (innBilett.fornavn == null || innBilett.fornavn === '') {
        $("#ErrorFornavn").html("Må skrive noe i fornavnet");
        Error++;
    }
    if (innBilett.etternavn == null || innBilett.etternavn === '') {
        $("#ErrorEtternavn").html("Må skrive noe i etternavnet");
        Error++;
    }
    if (innBilett.tlf == null || innBilett.tlf === '') {
        $("#ErrorTlf").html("Må skrive noe i telefonnr");
        Error++;
    }
    if (innBilett.epost == null || innBilett.epost === '') {
        $("#ErrorEpost").html("Må skrive noe i epost");
        Error++;
    }

    if (Error === 0) {
        $("#ErrorAntall").html(" ")
        $("#ErrorFornavn").html(" ")
        $("#ErrorEtternavn").html(" ")
        $("#ErrorTlf").html("")
        $("#ErrorEpost").html(" ")

        $.post("/kjop", innBilett, function () {
            hentBilett();

        });

        function hentBilett() {
            $.get("/hentBilett", function (data) {
                formaterData(data);
            });
        }

        function formaterData(biletter) {
            let ut = '<table class="table table-hover"<tr> <th><h3>Film</h3></th><th><h3>Antall</h3></th> <th><h3>Fornavn</h3></th> <th><h3>Etternavn</h3></th> <th><h3>Telefonnr</h3></th> <th><h3>Epost</h3></th> </tr>';
            for (const Bilett of biletter) {
                ut += "<tr> <td><p>" + Bilett.film + "</p></td> <td><p>" + Bilett.antall + "</p></td> <td><p>" + Bilett.fornavn + "</p></td> <td><p>" + Bilett.etternavn + "</p></td> <td><p>" + Bilett.tlf + "</p></td> <td><p>" + Bilett.epost + "</p></td> </tr>";

            }
            ut += "</table";
            $('#ut').html(ut)
        }

        $("#Antall").html("");
        $("#Fornavn").html("");
        $("#Etternavn").html("");
        $("#Tlf").html("");
        $("#Epost").html("");
    } else {
        return
    }
}

function slett() {
    $.get("/slett", function () {
    });
    $("#ut").html("");
    $("#ErrorAntall").html("");
    $("#ErrorFornavn").html("");
    $("#ErrorEtternavn").html("");
    $("#ErrorTlf").html("");
    $("#ErrorEpost").html("");
}
