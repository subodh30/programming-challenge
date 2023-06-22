import axios from "axios";

export interface Population {
  premiseId: string;
  totalAnimal: number;
}

export interface Movement {
  accountOrCompany: string;
  newMovementreason: string;
  newSpecies: string;
  newOriginaddress: string;
  newOrigincity: string;
  newOriginname: string;
  newOriginpostalcode: string;
  newOriginpremid: string;
  newOriginstate: string;
  newDestinationaddress: string;
  newDestinationcity: string;
  newDestinationname: string;
  newDestinationpostalcode: string;
  newDestinationpremid: string;
  newDestinationstate: string;
  originLat: number;
  originLon: number;
  destinationLat: number;
  destinationLon: number;
  newNumitemsmoved: number;
  newShipmentsstartdate: string;
}

class HttpService {
  fetchPupulationData() {
    return axios.get<Population[]>("http://localhost:9090/populations");
  }

  fetchMovementData() {
    return axios.get<Movement[]>("http://localhost:9090/movements");
  }
}

export default new HttpService();
